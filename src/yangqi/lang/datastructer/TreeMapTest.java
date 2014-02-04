package yangqi.lang.datastructer;

import java.util.TreeMap;

/**
 * Created by yangqi on 2/4/14.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,String>treeMap=new TreeMap<String,String>();

        treeMap.put("a","value-of-a");
        treeMap.put("c","value-of-c");
        treeMap.put("b","value-of-b");
        treeMap.put("f","value-of-f");
        treeMap.put("e","value-of-e");

        for(String k:treeMap.keySet()){
            System.out.println("value is "+k);
        }
    }
}
