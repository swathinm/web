public class UdemyChallenge2 {
    public static void printMegaBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }if(kiloBytes>=0){
            int MegaBytes=kiloBytes/1024;
            int remainKiloBytes=kiloBytes%1024;
            System.out.println(kiloBytes+"="+MegaBytes+" and "+remainKiloBytes);
        }

    }

    public static void main(String[] args) {
        printMegaBytes(47634);
    }
}
