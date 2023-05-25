public class ExceptionHandling2 {
    public static void main(String[] args) {
        // Null pointer Exception
//        String s=null;
//        int a=0;
//       System.out.println(s.length());
//       System.out.println(a);
        // Null pointer Exception by try catch
        try {
            int a=0;
            System.out.println(a);
            String s=null;
            System.out.println(s.length());

        }catch(Exception e){
            System.out.println(e);
            System.out.println("executes the catch block");
        }
        System.out.println("Continues....");
    }

}
