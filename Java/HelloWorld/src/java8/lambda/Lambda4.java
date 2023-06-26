package java8.lambda;

public interface Lambda4 {

  //  public abstract int m1();

    public default int m(int a, int b) {
        return a+b;
    }
}
class Lambdass implements Lambda4{

    public static void main(String[] args) {
        Lambdass l=new Lambdass();
        System.out.println( l.m(10,20));
    }
}