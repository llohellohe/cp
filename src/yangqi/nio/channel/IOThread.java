package yangqi.nio.channel;

import java.util.Random;

public class IOThread extends Thread {
	private String result = null;
	private Random random=new Random();
	public void run() {
		long workTime=random.nextInt(3)*1000l;
		System.out.println("START TO PROCESS TASK:" + this.getId()+",work time is "+workTime);
		try {
			Thread.sleep(workTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.result = "FINISH :" + this.getId();
	}

	public synchronized String getResult() {
		return result;
	}

}
