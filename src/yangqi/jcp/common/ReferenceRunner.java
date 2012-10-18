package yangqi.jcp.common;

public class ReferenceRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonReference r=new DeamonReference();
		
		
		r.fake();
		synchronized(Thread.currentThread()){
		try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
