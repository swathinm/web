package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HAshSet {
    public static void main(String[] args) {

//         HashSet hs=new HashSet(100);//intial Capacity 100
//        HashSet hs=new HashSet(100, (float)0.90);
//        HashSet <Integer> hs=new HashSet<Integer>();
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add("Welcome");
        hs.add(19.0);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);

        hs.remove(19.0);
        System.out.println("After Removing :"+hs);

        System.out.println(hs.contains("Welcome"));
        System.out.println(hs.contains(23));

        System.out.println(hs.isEmpty());

        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
