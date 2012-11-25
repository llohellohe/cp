package yangqi.jcp.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableExample {

	private static ExecutorService pool=Executors.newFixedThreadPool(3);
	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 * @throws TimeoutException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		Future <Integer>f1=pool.submit(new TestCallable("mp3"));
		//Future <Integer>f2=pool.submit(new TestCallable("book"));
		
		int i=0;
		//i+=f2.get();
		i+=f1.get(1,TimeUnit.SECONDS);
		
		System.out.println(i);
		
		pool.shutdown();
	}
	
	
	

}
