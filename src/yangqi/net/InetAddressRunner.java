package yangqi.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetAddress address=InetAddress.getLocalHost();
			showAddress(address);
			
			
			InetAddress address2=InetAddress.getByName("www.hupu.com");
			showAddress(address2);
			
			InetAddress address3=InetAddress.getByName("74.125.128.255");
			showAddress(address3);
			
			InetAddress address4=InetAddress.getByName("www.neu6.edu.cn");
			showAddress(address4);
			
			
            InetAddress resolvedAddresses[] = InetAddress.getAllByName("www.baidu.com");

            for (InetAddress add : resolvedAddresses) {
                System.out.println("Baidu:" + add.getHostAddress());
            }

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

	private static void showAddress(InetAddress address) {
		System.out.println(address.getAddress().length);
		
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		byte[]add=address.getAddress();
		
	}

}
