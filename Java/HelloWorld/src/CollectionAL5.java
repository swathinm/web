import java.util.ArrayList;

public class CollectionAL5 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("get");
        al.add("set");
        al.add("returns get value");

        System.out.println(al);

        System.out.println(al.get(1));

        al.set(1,"sets element in the index");

        System.out.println(al);

        for(Object obj:al){
            System.out.println(obj);

        }
    }
}
