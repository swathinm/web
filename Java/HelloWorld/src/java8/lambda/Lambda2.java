package java8.lambda;

public interface Lambda2 {
    public abstract int m1(int a, int b);

    public static void main(String[] args) {
        Lambda2 l=(a,b)->a+b;
        System.out.println(l.m1(10,20));
    }

}



