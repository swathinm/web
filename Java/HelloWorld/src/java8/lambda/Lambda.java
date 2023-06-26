package java8.lambda;

public interface Lambda {
    public default void m1() {
        System.out.println("hlo");
    }
    class Testss implements Lambda{
        public void m1(String m){
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        Testss obj=new Testss();
        obj.m1("yughjb");
        obj.m1();

    }
}
