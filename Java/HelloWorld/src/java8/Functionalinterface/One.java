package java8.Functionalinterface;
@FunctionalInterface
public interface One {
    public void m1();
//    public void m1(String yh);
//    public void m1(int a,int b);

    public static int m2() {
        return 1;
    }
}

    class Test implements  One{
//    public void m1(int a,int b){
//        System.out.println(a+b);
//    }

    public void m1(){
        System.out.println("ok");
    }
//    public void m1(String yh){
//        System.out.println(yh);
//    }

        public static void main(String[] args) {
            Test obj=new Test();
//            obj.m1();
            obj.m1();
            System.out.println(One.m2());
        }

   }

