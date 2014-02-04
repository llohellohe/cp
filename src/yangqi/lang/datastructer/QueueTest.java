package yangqi.lang.datastructer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by yangqi on 2/4/14.
 */
public class QueueTest {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>();

        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.add("f");


        Object[] all = queue.toArray();

        for (Object s : all) {
            System.out.println((String) s);
        }

        queue.add("g");
        System.out.println("all after add element");

        for (Object s : all) {
            System.out.println((String) s);
        }

        String[]allString=queue.toArray(new String[0]);

        System.out.println("all after return typed string");
        for (String s : allString) {
            System.out.println(s);
        }

        System.out.println("====operation====element===");

        String element=queue.element();
        System.out.println("element is "+element);
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("====operation====peek===");

         element=queue.element();
        System.out.println("element is "+element);
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("====operation====offer===");

        queue.offer("h");
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("====operation====poll===");

        element=queue.poll();
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("====operation====remove===");

        element=queue.remove();
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
