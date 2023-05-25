public class UdemyChallenge4 {
    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return ((feet*12)+inches)*2.54;


    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(9586));
    }
}
