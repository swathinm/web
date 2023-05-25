import java.util.*;
import java.util.Arrays;
import java.util.List;

class Arraylist1{
    public static void main(String[] args){
        Integer a[]={10,20,30,40,50,60};
        List<Integer> l= Arrays.asList(a);
        System.out.println(l);



        List<Integer> a2=new ArrayList<>(l.subList( 0, 2));
        System.out.println(a2);





    }
}
