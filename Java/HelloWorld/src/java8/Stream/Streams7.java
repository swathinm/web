package java8.Stream;

import java.util.ArrayList;

public class Streams7 {
    public static void main(String[] args) {
        ArrayList<Integer> Al=new ArrayList<Integer>();
       Al.add(100);
       Al.add(50);
       Al.add(200);
       Al.add(300);
       Al.add(400);

     Al.stream().filter(num->num>200)
             .forEach(names-> System.out.println(names));


    }
}
