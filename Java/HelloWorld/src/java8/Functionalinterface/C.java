package java8.Functionalinterface;
//
@FunctionalInterface
 interface C {
    void say(String msg);

    int hashCode();
    String toString();
    boolean equals(Object obj);

}
  class Fun implements C{

     @Override
     public void say(String msg) {
         System.out.println(msg);
     }

     public static void main(String[] args) {
         Fun f=new Fun();
         f.say("Hello There");
     }
 }