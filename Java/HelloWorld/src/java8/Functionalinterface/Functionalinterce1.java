package java8.Functionalinterface;

interface Functionalinterce1 {
    default void v(){
        System.out.println("hi");
    }
}
@FunctionalInterface
interface HEllo extends Functionalinterce1{
    void say(String a);
}
 class Functional implements HEllo{
    public void say(String a){
        System.out.println(a);
    }

     public static void main(String[] args) {
         Functional f=new Functional();
         f.say("Hello There");
         f.v();
     }
}