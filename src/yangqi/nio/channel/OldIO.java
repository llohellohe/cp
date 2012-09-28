package yangqi.nio.channel;

public class OldIO {
	public String execute() {
        IOThread thread = new IOThread();
        thread.start();
        try {
            thread.join(2000); // Wait for 15 seconds
        } catch (InterruptedException ie) {
        	System.out.println("TIME OUT ");
        }

        return thread.getResult();
    }

}
