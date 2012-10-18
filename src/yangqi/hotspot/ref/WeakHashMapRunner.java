package yangqi.hotspot.ref;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapRunner {

	/**
	 * run as -Xms30m -Xmx30m
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new WeakHashMap<Integer, String>();

		int i = 0;
		for (;i<10;i++) {
			map.put(i, new String("more memory!")+i);
		}
		for (;i<300000;i++) {
			map.put(i, new String("more memory!")+i);
			System.out.println(i+":"+map.size());
		}
		for (i=0;;i++) {
			//if(map.get(i)==null){
				System.out.println(i+":"+map.size()+map.get(i));
				//break;
			
		}
		//	System.out.println("=====");
//		for (i=0;i<10;i++) {
//			System.out.println(i+":"+map.size()+map.get(i));
//		}
	}

}
