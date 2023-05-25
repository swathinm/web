package java8;

public interface One {

    public default void m1() {
        System.out.println("m1 method");
    }

    public default void m2() {
        System.out.println("m2 method");
    }
}

    class Test implements  One{

        public static void main(String[] args) {
            Test obj=new Test();
            obj.m1();
            obj.m2();
        }

   }

