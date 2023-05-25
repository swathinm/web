import java.util.ArrayList;

public class CollectionCRUD {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Create");
        list.add("Read");
        list.add("Update");
        list.add("Delete");
        System.out.println(list);

        list.add(2,2);
        list.set(4,5);
        System.out.println(list);

        list.remove(2);//index number
        System.out.println(list);
    }
}
