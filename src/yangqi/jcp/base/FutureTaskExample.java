package yangqi.jcp.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Integer> callable=new TestCallable("may here");
		
		FutureTask <Integer>task=new FutureTask<Integer>(callable);
		
		new Thread(task).start();
		
		System.out.println(task.get());
		
	}

}
