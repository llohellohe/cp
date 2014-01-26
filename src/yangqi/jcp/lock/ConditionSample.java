package yangqi.jcp.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ConditionSample
 * 
 * @author yangqi Jan 25, 2014 10:28:35 PM
 */
public class ConditionSample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> workingQueue = new ArrayList<>();

        Lock lock = new ReentrantLock();

        Condition emptyCondtion = lock.newCondition();

        Condition fullCondtion = lock.newCondition();

        Thread reader = new Thread(new Reader2(workingQueue, lock, emptyCondtion, fullCondtion));
        reader.start();

        Thread writer = new Thread(new Writer2(workingQueue, lock, emptyCondtion, fullCondtion));
        writer.start();
    }

}

class Reader2 implements Runnable {

    private List<String> workingQueue  = null;

    private Lock         lock          = null;

    private Condition    emptyCondtion = null;

    private Condition    fullCondtion  = null;

    Reader2(List<String> workingQueue, Lock lock, Condition emptyCondtion, Condition fullCondtion) {
        this.workingQueue = workingQueue;
        this.lock = lock;
        this.emptyCondtion = emptyCondtion;
        this.fullCondtion = fullCondtion;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (;;) {
            try {
                lock.lock();

                if (workingQueue.isEmpty()) {
                    fullCondtion.await();
                }

                if (!workingQueue.isEmpty()) {
                    for (String s : workingQueue) {
                        System.out.println("read out " + s);
                    }
                    workingQueue.clear();

                    emptyCondtion.signal();
                } else {
                    System.out.println("can not read empty queue ");
                }

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}

class Writer2 implements Runnable {

    private List<String> workingQueue  = null;

    private Lock         lock          = null;

    private int          count         = 0;

    private Condition    emptyCondtion = null;

    private Condition    fullCondtion  = null;

    Writer2(List<String> workingQueue, Lock lock, Condition emptyCondtion, Condition fullCondtion) {
        this.workingQueue = workingQueue;
        this.lock = lock;
        this.emptyCondtion = emptyCondtion;
        this.fullCondtion = fullCondtion;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (;;) {
            try {
                lock.lock();

                if (workingQueue.isEmpty()) {
                    String yum = "yummy " + count++;
                    workingQueue.add(yum);
                    System.out.println("add " + yum);
                    fullCondtion.signal();
                }

                try {
                    emptyCondtion.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } finally {
                lock.unlock();
            }
        }
    }
}
