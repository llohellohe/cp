package yangqi.jcp.executor;

import java.util.concurrent.TimeUnit;

/**
 * 类StopThread.java的实现描述：TODO 类实现描述 
 * @author yangqi Jan 23, 2014 9:41:48 PM
 */
public class InterruptThread {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Thread t = new Thread(new Scan());
        t.start();

        TimeUnit.SECONDS.sleep(1);

        t.stop();
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
                System.out.println("a");
            }

        }

    }

}
