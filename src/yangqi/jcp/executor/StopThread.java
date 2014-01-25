package yangqi.jcp.executor;

import java.util.concurrent.TimeUnit;

/**
 * 类StopThread.java的实现描述：TODO 类实现描述 
 * @author yangqi Jan 23, 2014 9:41:48 PM
 */
public class StopThread {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Thread t = new Thread(new Scan());
        t.start();

        TimeUnit.SECONDS.sleep(1);

        t.interrupt();
        while (t.isAlive()) {
        System.out.println("main over" + t.isAlive());
        }
        System.out.println("main over" + t.isAlive());


    }

    static class Scan implements Runnable {

        /*
         * (non-Javadoc)
         * @see java.lang.Runnable#run()
         */
        @Override
        public void run() {
            while (true) {
                try {
                    doIt();
                } catch (InterruptedException e) {
                    System.out.println("OVER!!!");
                    break;
                }
            }

        }
        
        public void doIt() throws InterruptedException {
            if (Thread.interrupted()) {
                System.out.println("a is interrupt");
                throw new InterruptedException("I am dying");
            } else {
                System.out.println("a is not interrupt");
            }
        }

    }

}
