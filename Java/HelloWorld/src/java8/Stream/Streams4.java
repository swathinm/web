package java8.Stream;

import java.util.ArrayList;

public class Streams4 {
    public static void main(String[] args) {
        ArrayList<Integer> Al=new ArrayList<Integer>();
        Al.add(10);
        Al.add(20);
        Al.add(30);
        Al.add(40);
        Al.add(50);

        Long l= Al.stream().filter(num->num%2==0)
                .count();
        System.out.println(l);

    }
}
