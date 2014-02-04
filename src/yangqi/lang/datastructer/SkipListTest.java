package yangqi.lang.datastructer;

import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created by yangqi on 2/4/14.
 */
public class SkipListTest {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,String> skipListMap = new ConcurrentSkipListMap<>();

        skipListMap.put("a","value-of-a");
        skipListMap.put("c","value-of-c");
        skipListMap.put("b","value-of-b");
        skipListMap.put("f","value-of-f");
        skipListMap.put("e","value-of-e");

        for(String s:skipListMap.keySet()){
           System.out.println(s+" is the key");
        }
        System.out.println("=======");

        ConcurrentSkipListSet<String> skipListSet=new ConcurrentSkipListSet<String>();

        skipListSet.add("a");
        skipListSet.add("c");
        skipListSet.add("d");
        skipListSet.add("b");
        skipListSet.add("e");

        for(String s:skipListSet){
            System.out.println(s+" is the key");
        }
    }
}
