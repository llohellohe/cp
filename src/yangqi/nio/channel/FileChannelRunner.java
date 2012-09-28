package yangqi.nio.channel;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelRunner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		read("/Users/yangqi/seo-keyword/p4p-test-result.dat");
		
		
	}
	
	private static void read(String filename) throws IOException {
		FileInputStream fis=new FileInputStream(filename);
		
		FileChannel channel=fis.getChannel();
		
		ByteBuffer buffer=ByteBuffer.allocate(20);
		
		
		while(channel.read(buffer)>0){
			
			buffer.flip();
			
			String s=new String(buffer.array(),"utf-8");
			
			System.out.print(s);
			
			buffer.clear();
		}
		
		
		fis.close();
		
		
	}

}
