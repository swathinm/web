import java.util.Iterator;
import java.util.Stack;

public class Collections4 {
    public static void main(String[] args) {
        Stack list=new Stack();
        list.push("Stack1");
        list.push("Stack2");
        list.push("Stack3");
        list.push("Stack4");
        list.pop();


        System.out.println(list);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
