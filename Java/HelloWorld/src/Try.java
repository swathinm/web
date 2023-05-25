public class Try {
    public static void main(String[] args) {
        try {
            try {
                //System.out.println("going to 0");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
                //System.exit(0);
            }
            try {
                int i[] = new int[5];
                i[5] = 4;
            } catch (ArithmeticException e) {
                System.out.println(e);

            }
        }
            catch(Exception e) {
                System.out.println("Handled the exception");
            }
        System.out.println("normal flow");


    }
}
