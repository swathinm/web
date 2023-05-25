import java.util.ArrayList;

public class CollectionAL {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Swathi");
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        a1.add("F");
        a1.add("G");
        a1.add(Boolean.FALSE);

        System.out.println(a1);
        a1.add(0,1);
        System.out.println(a1);

        ArrayList a2=new ArrayList();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        System.out.println(a2.addAll(a1));
        System.out.println(a2);



    }
}
