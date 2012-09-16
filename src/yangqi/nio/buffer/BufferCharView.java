package yangqi.nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;

public class BufferCharView

{
	public static void main(String[] argv) throws Exception {
		ByteBuffer byteBuffer = ByteBuffer.allocate(7).order(
				ByteOrder.BIG_ENDIAN);
		CharBuffer charBuffer = byteBuffer.asCharBuffer();
		// Load the ByteBuffer with some bytes
		byteBuffer.put(0, (byte) 0);
		byteBuffer.put(1, (byte) 'H');
		byteBuffer.put(2, (byte) 0);
		byteBuffer.put(3, (byte) 'i');
		byteBuffer.put(4, (byte) 0);
		byteBuffer.put(5, (byte) '!');
		byteBuffer.put(6, (byte) 0);
		
		int c=byteBuffer.capacity();
		System.out.println(byteBuffer.getChar());
		
		println(byteBuffer);
		println(charBuffer);
	}

	// Print info about a buffer
	private static void println(Buffer buffer) {
		System.out.println(buffer+" pos=" + buffer.position() + ", limit="
				+ buffer.limit() + ", capacity=" + buffer.capacity());
		
//		while(buffer.hasRemaining()){
//			System.out.println(buffer.toString());
//		}

	}
}