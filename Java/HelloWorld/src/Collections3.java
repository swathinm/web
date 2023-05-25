import java.util.Iterator;
import java.util.Vector;

public class Collections3 {
    public static void main(String[] args) {
        Vector list=new Vector();
        list.add("Vector1");
        list.add("Vector2");
        list.add("Vector3");
        list.add("Vector4");

        System.out.println(list);

        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
