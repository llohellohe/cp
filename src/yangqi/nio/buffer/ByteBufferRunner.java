package yangqi.nio.buffer;

import java.nio.ByteBuffer;

public class ByteBufferRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data = new byte[16];
		ByteBuffer buf = ByteBuffer.wrap(data);

		buf.putShort(0, (short)0x1234);
		buf.putInt(2, 0x12345678);
		buf.putLong(8, 0x1122334455667788L);

		//for (int ii = 0 ; ii < data.length ; ii++)
		    System.out.println(buf.getShort());
		    System.out.println(buf.getInt());
		    System.out.println(buf.getLong());
	}

}
