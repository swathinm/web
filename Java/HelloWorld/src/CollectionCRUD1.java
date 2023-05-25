import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCRUD1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(0);
        a.add(1);
        a.add(2);

        System.out.println(a);

        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        for(Object obj:a){
            System.out.println(obj);

        }

    }
}
