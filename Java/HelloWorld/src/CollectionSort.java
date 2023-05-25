import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Apple");
        al.add("yak");
        al.add("BAll");
        al.add("Zebra");

        Collections.sort(al);

        System.out.println(al);

        ArrayList al2=new ArrayList();
        al2.add(1);
        al2.add(9);
        al2.add(6);
        al2.add(5);

        Collections.sort(al2);

        System.out.println(al2);

    }
}
