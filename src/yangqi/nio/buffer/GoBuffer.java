package yangqi.nio.buffer;

import java.nio.CharBuffer;

public class GoBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testPutAndGet();
		
	}
	
	public static void testPutAndGet(){
		CharBuffer charBuffer=CharBuffer.allocate(10);
		
		String a="hello";
		
		System.out.println(a);
		for(int i=0;i<a.length();i++){
		charBuffer.put(a.charAt(i));
		}
		charBuffer.flip();
		
			System.out.println(charBuffer.get());
			System.out.println(charBuffer.get());
			System.out.println(charBuffer.get());
		while(charBuffer.hasRemaining( )){
			System.out.println(charBuffer.get());
		}
		
	}

}
