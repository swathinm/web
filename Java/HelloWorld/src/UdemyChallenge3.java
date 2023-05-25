public class UdemyChallenge3 {
    public static String getDurationString(int seconds){

        // one step approach
//      int hours=seconds/3600;
//        System.out.println(hours);
//        return "";

        // two step appraoch

        int minutes=seconds/60;
       // int hours=minutes/60;
       // System.out.println(hours);

        //int remainingMinutes=minutes%60;
//        System.out.println(minutes);
//        System.out.println(remainingMinutes);

       // int remainingSeconds=seconds%60;
//        System.out.println(remainingSeconds);

        return getDurationString( minutes, seconds);
    }

    public static String getDurationString(int minutes,int seconds){
    //int minutes=seconds/60;
    int hours=minutes/60;

    int remaingMinutes=minutes%60;
    int remaingSeconds=seconds%60;

    return hours+"h"+remaingMinutes+"m"+remaingSeconds+"s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(6520)
        );
        System.out.println(getDurationString(65 ,48));
    }
}
