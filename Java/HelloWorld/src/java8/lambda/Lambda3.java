package java8.lambda;

public interface Lambda3 {
     int  m3(int a, int b);

}
class Hlo{


    static Lambda3 h=(a,b)->(a+b);
    public static void main(String[] args) {
       // Lambda3 h=(a,b)-> a+b ;
        //Lambda3 h=(int a,int b)-> {return a+b;};

        System.out.println( h.m3(10,20));
    }


}
