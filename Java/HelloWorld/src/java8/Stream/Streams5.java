package java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams5 {
    public static void main(String[] args) {
        ArrayList<String> Al=new ArrayList<String>();
        Al.add("Swathi");
        Al.add("Cartoon");
        Al.add("Sana");
        Al.add("Meeni");
        Al.add("NM");

        List<String> l= Al.stream().filter(name->name.startsWith("S"))
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(l);

    }
}
