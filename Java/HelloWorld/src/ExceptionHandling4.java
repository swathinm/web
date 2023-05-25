public class ExceptionHandling4 {
    public static void main(String[] args) {
        int[] a=new int[5];
        try {
            System.out.println(a[0] = 10);
            System.out.println(a[1] = 10);
            System.out.println(a[2] = 10);
            System.out.println(a[3] = 10);
            System.out.println(a[4] = 10);
            System.out.println(a[5] = 10);
        }catch(Exception e){
            System.out.println(78);
        }


    }
}
