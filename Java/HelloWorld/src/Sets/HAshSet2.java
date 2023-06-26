package Sets;

import java.util.HashSet;

public class HAshSet2 {

    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(3);
        hs.add(2);

        System.out.println(hs);

        HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.add(5 );
        hs1.add(4);
        hs1.add(3);

        System.out.println(hs1);

        hs1.addAll(hs);
        System.out.println(hs1);




    }
}
