package yangqi.hotspot.ref;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapRunner {

	/**
	 * run as -Xms30m -Xmx30m -XX:+PrintGCDetails
	 * -XX:NewSize=30m -XX:MaxNewSize=30m -XX:NewRatio=3 -XX:NewSize=5m -XX:+UseSerialGC  -XX:+PrintGCDetails  -XX:+PrintGCTimeStamps -XX:+PrintGCApplicationConcurrentTime -XX:+PrintGCApplicationStoppedTime -XX:PermSize=5m -XX:MaxPermSize=5m
	 * -verbose:class
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new WeakHashMap<Integer, String>();

		int i = 0;
		for (;i<10;i++) {
			map.put(i, new String("more memory!")+i);
		}
		for (;;i++) {
			map.put(i, new String("more memory!")+i);
			if(i%10000==0)
			System.out.println(i+":"+map.size());
		}
	}

}
