package yangqi.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelRunner {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		client();
	}
	
	private static void client() throws IOException, InterruptedException{
		int port=12345;
		
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		
		SocketChannel clientChannel=SocketChannel.open();
		
		//clientChannel.configureBlocking(false);
		
		clientChannel.connect(new InetSocketAddress("127.0.0.1",port));	
		
		
		System.out.println(clientChannel.isConnected());
		
		buffer.put("hello world".getBytes());

		buffer.flip();
		
		clientChannel.write(buffer);
	}

}
