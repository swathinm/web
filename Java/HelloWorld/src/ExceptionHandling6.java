public class ExceptionHandling6 {
    public static void main(String[] args) {

       try{
           int[] i=new int[5];
           i[4]=30/2;
           System.out.println(i[4]);
       }

       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndex");
       }
       catch(ArithmeticException e){
           System.out.println("Arthematic");
       }
       catch(Exception e){
           System.out.println("Parent Exception");
       }
        System.out.println("Rest of the program continues");

    }
}
