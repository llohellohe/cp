package yangqi.nio.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IOThreadRunner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		OldIO io=new OldIO();
		System.out.println(io.execute());
		
		String fileName="/Users/yangqi/seo-keyword/en_keywords_out.dat";
		
		getSize2(fileName);
		
		getSize1(fileName);
		
		read("/Users/yangqi/seo-keyword/p4p-test-result.dat");
		
		
	}
	
	private static void read(String filename) throws IOException {
		FileInputStream fis=new FileInputStream(filename);
		
		FileChannel channel=fis.getChannel();
		
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		
		
		int size=channel.read(buffer);
		
		System.out.println(size);
		
		fis.close();
		
		
	}

	private static void getSize1(String filename) throws IOException{
		FileInputStream fis=new FileInputStream(filename);
		
		long start=System.currentTimeMillis();
		
		long size=fis.getChannel().size();
		
		long end=System.currentTimeMillis();
		
		fis.close();
		
		System.out.println("SIZE IS "+size+" ,use "+(end-start));
	}
	
	private static void getSize2(String filename) throws IOException{
		File file=new File(filename);
		
		long start=System.currentTimeMillis();
		
		long size=file.length();
		
		long end=System.currentTimeMillis();
		
		
		System.out.println("SIZE IS "+size+" ,use "+(end-start));
	}

}
