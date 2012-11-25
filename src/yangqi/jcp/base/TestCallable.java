package yangqi.jcp.base;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<Integer>{

	private String word;
	
	TestCallable(String word){
			this.word=word;
	}
	
	@Override
	public Integer call() throws Exception {
		//while(!Thread.currentThread().isInterrupted()){
		//System.out.println("a");	
		//}
		return Integer.valueOf(word.length());
	}
	
}
