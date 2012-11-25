package yangqi.jcp.base;

public class ThreadTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		
		testJoin();
		
		
	}
	
	public void common(){
		Runtime.getRuntime().addShutdownHook(new Thread(){
			public void run(){
				System.out.println("FUCK");
			}
		});
		// TODO Auto-generated method stub
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		
		
		System.out.println(Thread.currentThread());
		
		
		new Runnable(){
			{
				System.out.println("IN HERE");
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
	public static void testJoin(){
		
		long start=System.currentTimeMillis();
		
		Thread t=new TestThread();	
		t.start();
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
		
		long end=System.currentTimeMillis();
		
		System.out.println("END:"+(end-start));
	}
	
	private void stop(){
		Thread.currentThread().interrupt();
	}

}


class TestThread extends Thread{
	public void run(){
		System.out.println("In Thread:"+this.getName()+" current:"+currentThread());
		
		while(!this.isInterrupted()){
			System.out.println("a");	
		}
	}
}