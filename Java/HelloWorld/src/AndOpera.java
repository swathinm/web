public class AndOpera {
    public static void main(String[] args) {
        int a=50;

        if(a>25){
            a=1000+a;
        }

        int b=100;
        if((a<25)&&(b>1000)){
            a=a-1000;
     }
//        else{
//            System.out.println("nope:(");
//        }
    }
}
