package ExampleHash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleHash {
    public static void main(String[] args) {
        /*this is how to daclare HashMap*/
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        //Adding elements to HashMAP
        hmap.put(12,"Thao");
        hmap.put(2,"Hai");
        hmap.put(7,"Linh");
        hmap.put(49,"Dung");
        hmap.put(3,"Hung");
        //display content using Iterator
        Set set=hmap.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry=(Map.Entry)iterator.next();
            System.out.print("key is:"+ mentry.getValue() + " & value is:");
            System.out.println(mentry.getValue());
        }

        //get values babsed on key
        String var=hmap.get(2);
        System.out.println("value at index 2 is:" + var);

        //remove values based on key
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2=hmap.entrySet();
        Iterator iterator2=set2.iterator();
        while (iterator2.hasNext()){
            Map.Entry mentry2=(Map.Entry)iterator2.next();
            System.out.print("Key is:"+mentry2.getKey() + "& value is:");
            System.out.println(mentry2.getValue());
        }

    }
}

