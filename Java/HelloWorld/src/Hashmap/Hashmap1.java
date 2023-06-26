package Hashmap;

import java.util.HashMap;

public class Hashmap1  {
    public static void main(String[] args) {
        HashMap h=new HashMap ();

        h.put(1,"Swathi");
        h.put(2,"Meeni");
        h.put(3,"priya");

        System.out.println(h);
        System.out.println(h.get(1));
        h.remove(1);

        System.out.println(h);

        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("Meeni"));

        System.out.println( h.isEmpty());

        System.out.println(h.size());

      // h.clear();

       // h.keySet();
        System.out.println(h.keySet());
        System.out.println(h.values());
        System.out.println(h.entrySet());


    }
}