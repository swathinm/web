public class ExceptionHandling {
    public static void main(String[] args) {
        // Arthematic Exception
//        int data=100/0;
//        System.out.println(data);
        // Arthematic Exception solving using Exception handling try,,catch
        try{
            int data=100/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest code will be continued");

    }

}
