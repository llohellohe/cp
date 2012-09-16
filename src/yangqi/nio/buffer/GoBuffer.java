package yangqi.nio.buffer;

import java.nio.ByteOrder;
import java.nio.CharBuffer;

public class GoBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testPutAndGet();

		System.out.println(ByteOrder.nativeOrder());

		int i = 0;
		System.out.println(i++);

	}

	public static void testPutAndGet() {
		int mark = 3;
		CharBuffer charBuffer = CharBuffer.allocate(10);

		System.out.println("IS DIRECT " + charBuffer.isDirect());
		String a = "hello";

		System.out.println(a);
		for (int i = 0; i < a.length(); i++) {
			if (i == 3) {
				charBuffer.mark();
			}
			charBuffer.put(a.charAt(i));
		}
		charBuffer.flip();

		System.out.println(charBuffer.get());
		System.out.println(charBuffer.get());
		System.out.println(charBuffer.get());
		while (charBuffer.hasRemaining()) {
			System.out.println(charBuffer.get());
		}
		System.out.println("RESET");

	}

}
