package java8.Functionalinterface;

import java.util.function.Predicate;

public class Predefined3 {
    public static void main(String[] args) {
        int a[]={5,15,20,25,30,35,40,45,50,60,65};

        Predicate<Integer> p1= i->i%2==0;
        Predicate<Integer> p2= i->i>20;

        for (int n:a) {
            if(p1.and(p2).test(n)){
                System.out.println(n); 
            }
        }
    }

}
