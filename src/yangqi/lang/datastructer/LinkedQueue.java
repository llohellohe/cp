package yangqi.lang.datastructer;

import java.util.LinkedList;

/**
 * Created by yangqi on 2/4/14.
 */
public class LinkedQueue {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");

        System.out.println("pop:"+linkedList.pop());
        System.out.println("peek:"+linkedList.peek());
        System.out.println("peek:"+linkedList.peek());

    }
}
