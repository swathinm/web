package Sets;

import java.util.HashSet;

public class Hashset3 {

    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);

        HashSet set1=new HashSet();
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println(set1) ;

        set.retainAll(set1);

        System.out.println(set);


    }
}
