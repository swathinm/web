public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        int num1=(int)(one*1000);
        int num2=(int)(two*1000);
        return num1==num2;

    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175));
    }
}