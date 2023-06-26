package java8.lambda;

public interface Lambda1 {

    public int m1(int a,int b);
}

   class Lambdas {
      Lambda1 l=(a,b)->(a+b);
      public static void main(String[] args) {

          Lambdas li=new Lambdas();
          System.out.println(li.l.m1(10,20));


      }


}
