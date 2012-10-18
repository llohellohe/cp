package yangqi.jcp.common;

public class DeamonReference {

	private static String name = null;

	private static class Lock {

	};

	private static Lock lock = new Lock();

	static class Handler extends Thread {
		Handler(ThreadGroup tg, String name) {
			super(tg, name);
		}

		@Override
		public void run() {
			for (;;) {
				synchronized (lock) {
					if (name != null) {
						System.out.println("NAME IS " + name);
					} else {
						System.out.println("START TO WAIT 1");
						try {
							lock.wait(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("START TO WAIT 2");

					}
				}
			}
		}
	}

	static {

		ThreadGroup tg = Thread.currentThread().getThreadGroup();

		for (ThreadGroup tgn = tg; tgn != null; tg = tgn, tgn = tg.getParent())
			;

		Thread handler = new Handler(tg, "heihei");

		handler.setPriority(Thread.MAX_PRIORITY);
		handler.setDaemon(true);
		handler.start();

	}

	/**
	 * @param args
	 */
	public static void fake() {
	}

}
