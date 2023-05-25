package java8;
//
@FunctionalInterface
public interface C {
    abstract void m1();
    //void m44();
    default void m2(){
        System.out.println("hi");
    }
}
