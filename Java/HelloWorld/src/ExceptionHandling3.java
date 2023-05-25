public class ExceptionHandling3 {
    public static void main(String[] args) {
        // NumberFormat Exception
//        String s="abc";
//        String s="123";
//        int i=Integer.parseInt(s);
//        System.out.println(s);
        // NumberFormat Exception using
        try{
            String s="abc";
            int i=Integer.parseInt(s);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Continues...");
        }
        System.out.println("Rest code executes");
    }
}
