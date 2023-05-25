import java.util.ArrayList;

public class CollectionAL3 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.size());




        ArrayList list1=null; // Null pointer Exception

        list.addAll(list1);


    }
}
