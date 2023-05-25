import java.util.ArrayList;

public class CollectionAL2 {
    public static void main(String[] args) {
        ArrayList Alphabets=new ArrayList();
        Alphabets.add("A");
        Alphabets.add("B");
        Alphabets.add("C");
        System.out.println(Alphabets);

        ArrayList Numbers=new ArrayList();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        System.out.println(Numbers);

        System.out.println(Alphabets.addAll(Numbers));
        System.out.println(Alphabets);
        System.out.println(Alphabets.addAll(3,Numbers));
        System.out.println(Alphabets);
        System.out.println(Alphabets.removeAll(Numbers));
        System.out.println(Alphabets);

        System.out.println(Alphabets.addAll(12,Numbers));
        System.out.println(Alphabets);





    }
}
