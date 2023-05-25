import java.util.ArrayList;
import java.util.Iterator;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Swathi");
        list.add("Swathinm");
        list.add("Swathinme");
        list.add("Swathinmeee");
        System.out.println(list);

        list.trimToSize();

        Iterator itr=list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
