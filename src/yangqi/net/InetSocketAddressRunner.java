package yangqi.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetSocketAddressRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetSocketAddress address=new InetSocketAddress(12345);
			showAddress(address);
			
			
			InetSocketAddress address2=new InetSocketAddress("www.hupu.com",124);
			showAddress(address2);
			
			InetAddress ip=InetAddress.getByName("74.125.128.255");
			InetSocketAddress address3=new InetSocketAddress(ip,12345);
			showAddress(address3);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

	private static void showAddress(InetSocketAddress address) {
		System.out.print("host:"+address.getHostName());
		
		System.out.println(",port:"+address.getPort());
		
	}

}
