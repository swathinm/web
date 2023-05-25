import java.util.Iterator;
import java.util.LinkedList;

public class Collections2 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("ArrayList");
        list.add("LinkedList");
        list.add("VectorList");
        list.add("VectorList");

        System.out.println(list);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
           // System.out.println(itr.remove());
        }
    }
}
