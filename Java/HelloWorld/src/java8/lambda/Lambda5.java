package java8.lambda;

public interface Lambda5 {
    public abstract String m1(String s);


}
 class Main{
    public static void main(String[] args) {
        Lambda5 l =(n)->{
          String result="";
          for(int i=n.length()-1;i>=0;i--)
              result += n.charAt(i);
          return result;
        };
//        l = (String s) -> {return s;};
        System.out.println(l.m1("Swathi"));

    }
}