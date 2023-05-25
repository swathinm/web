import java.util.ArrayList;

public class CollectionAL1 {
    public static void main(String[] args) {
        ArrayList veg=new ArrayList();
        veg.add("tomo");
        veg.add("chilli");
        veg.add("onion");
        ArrayList fruits=new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("Mango");

        System.out.println(veg);
        System.out.println(fruits);
        System.out.println(veg.addAll(fruits));
        System.out.println(veg);
        System.out.println(fruits.addAll(veg));

        System.out.println(veg.addAll(1,fruits));
        System.out.println(veg);



      ArrayList flowers=null;

        veg.addAll(flowers);

    }
}
