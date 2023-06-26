package java8.Stream;

import java.util.ArrayList;

public class Streams6 {
    public static void main(String[] args) {
        ArrayList<String> Al=new ArrayList<String>();
        Al.add("Swathi");
        Al.add("Cartoon");
        Al.add("Sana");
        Al.add("Meeni");
        Al.add("NM");

     Al.stream().filter(name->name.startsWith("S"))
                .map(name->name.toUpperCase())
                .forEach(names-> System.out.println(names));


    }
}
