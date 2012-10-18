package yangqi.hotspot.ref;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

public class WeakReferenceRunner {

	/**
	 * run as -Xms30m -Xmx30m
	 * @param args
	 */
	public static void main(String[] args) {
		
		ReferenceQueue queue=new ReferenceQueue();
		
		Set<String>set=new HashSet<String>();

		int i = 0;
		for (;;i++) {
			String s=new String("I am ref "+i);
			set.add(s);
			Reference<String> ref=new WeakReference(s,queue);
			System.out.println(i+":"+queue.poll());
		}
	}

}
