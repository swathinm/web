public class ExceptionHandling7 {

    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }

        catch(ArithmeticException e){
            System.out.println("Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("Continues..");
    }
}
