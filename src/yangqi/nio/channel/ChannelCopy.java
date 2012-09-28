package yangqi.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelCopy {
	public static void main(String[] args) throws IOException {
		ReadableByteChannel source = Channels.newChannel(System.in);
		WritableByteChannel dest = Channels.newChannel(System.out);
		
		System.out.println(source.isOpen());
		System.out.println(dest.isOpen());
		
		channelCopy1(source, dest);
		// alternatively, call channelCopy2 (source, dest);
		source.close();
		System.out.println(source.isOpen());
		dest.close();
		System.out.println(dest.isOpen());
	}

	private static void channelCopy1(ReadableByteChannel src,
			WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(10);
		while (src.read(buffer) != -1) {
			// Prepare the buffer to be drained
			buffer.flip();
			// Write to the channel; may block
			dest.write(buffer);
			// If partial transfer, shift remainder down
			// If buffer is empty, same as doing clear( )
			//buffer.flip();
			buffer.compact();
		}
		// EOF will leave buffer in fill state
		buffer.flip();
		// Make sure that the buffer is fully drained
		while (buffer.hasRemaining()) {
			dest.write(buffer);
		}
	}

	private static void channelCopy2(ReadableByteChannel src,
			WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);
		while (src.read(buffer) != -1) {
			// Prepare the buffer to be drained
			buffer.flip();
			// Make sure that the buffer was fully drained
			while (buffer.hasRemaining()) {
				dest.write(buffer);
			}
			// Make the buffer empty, ready for filling
			buffer.clear();
		}
	}
}
