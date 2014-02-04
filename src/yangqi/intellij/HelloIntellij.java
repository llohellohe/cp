package yangqi.intellij;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangqi on 1/29/14.
 */
public class HelloIntellij {
    private int age;
    public static void main(String[] args) {
         foo("helllo",20);

        Map<String,String> map=new HashMap<String,String>();

        map.put("abc","test");

        System.out.println(map.get("abc"));

        foo("a",10);

        foo1();
    }



    private static void foo(String a,int i){
        a="hello";

        int j=10;
    }

    private static void foo1(){
        Map<String,String> map=new HashMap<String,String>();

        map.put("abc","test");

        System.out.println(map.get("abc"));
    }
}
