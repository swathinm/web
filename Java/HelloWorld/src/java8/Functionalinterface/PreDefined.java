package java8.Functionalinterface;

import java.util.function.Predicate;


public class PreDefined{
    public static void main(String[] args) {

        //ex1
        Predicate<Integer> pr=a->(a>18);

        System.out.println(pr.test(19));
        System.out.println(pr.test(10));

        //ex2 for String
        Predicate<String> pre=s->(s.length()>4);
        System.out.println(pre.test("hi"));
        System.out.println(pre.test("Swathi"));

       String names[]={"Swathi","Cartoon","Sri","dileep"};

        for(String name:names){


//            if(name.length()>4){
//                System.out.println(name);
//            }
        }


    }
}

