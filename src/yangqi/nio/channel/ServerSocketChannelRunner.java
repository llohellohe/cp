package yangqi.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ServerSocketChannelRunner {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		SocketChannel channel=SocketChannel.open();
		
		System.out.println(channel.isBlocking());
		
		channel.configureBlocking(false);
		
		System.out.println(channel.isBlocking());
		
		
		server();
	}
	 private static Charset charset = Charset.forName("US-ASCII");
	private static CharsetDecoder decoder = charset.newDecoder();
	private static void server() throws IOException, InterruptedException{
		int port=12345;
		
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		
		ServerSocketChannel serverChannel=ServerSocketChannel.open();
		
		
		serverChannel.socket().bind(new InetSocketAddress("127.0.0.1",port));	
		
		serverChannel.configureBlocking(false);
		
		while(true){
			System.out.println ("Waiting for connections");
            SocketChannel sc = serverChannel.accept( );
            if (sc == null) {
                // no connections, snooze a while
            	System.out.println("Opps,seem no socket");
                Thread.sleep (2000);
            } else {
                System.out.println ("Incoming connection from: "
                   + sc.socket().getRemoteSocketAddress( ));
                buffer.rewind( );
                sc.read (buffer);
                sc.close( );
                
                buffer.flip();
                
                CharBuffer cb=decoder.decode(buffer);
                
                System.out.println("FFFFUCK"+cb);
}
		}
	}

}
