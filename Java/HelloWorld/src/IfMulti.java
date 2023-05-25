public class IfMulti {
    public static void main(String[] args){
        double a=20.00;
        double b=80.00;

        double total=a+b*100.00;


         double value = total%40.00;


        boolean n = value==0?true:false;


        if(!n){
            System.out.println("got some remainder");
        }

    }

}
