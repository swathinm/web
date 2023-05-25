import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collections5 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Priya");
        a.add("Swathi");
        a.add("Meeni");

        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);
        //Arrays.sort(a.Collections.reverseOrder());

        Collections.reverse(a);
        System.out.println(a);

        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
