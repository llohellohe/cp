package yangqi.jcp.threadlocal;

import java.util.concurrent.TimeUnit;

/**
 * 类WaitAndNotify.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi Jan 25, 2014 10:28:35 PM
 */
public class WaitAndNotify {

    private static final String[] empty = new String[] { "true" };

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("abc");
        Thread reader = new Thread(new Reader(empty));
        reader.start();

        Thread writer = new Thread(new Writer(empty));
        writer.start();
    }

}

class Reader implements Runnable {

    private String[] empty;

    Reader(String[] empty) {
        this.empty = empty;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (;;) {
            synchronized (empty) {
                try {
                    if (empty[0].equals("true")) {
                        empty.wait();
                        System.out.println("Read yummy ");
                        empty[0] = "true";
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

class Writer implements Runnable {

    private String[] empty;

    Writer(String[] empty) {
        this.empty = empty;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (;;) {
            synchronized (empty) {
                if (empty[0].equals("true")) {
                    System.out.println("Add to queue,because queue is empty " + empty[0]);
                    empty.notify();
                } else {
                    System.out.println("Can not add to queue because queue is not " + empty[0]);
                }
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
