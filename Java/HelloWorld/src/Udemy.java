class SpeedConverter {
    // write your code here

    public static long toMilesPerHour(double kilometeresPerHour){
        if(kilometeresPerHour<0){
            return -1;
        }else {
            long rounded=Math.round(kilometeresPerHour );
            return rounded;
        }


    }
    public static void printConversion(double kilometeresPerHour){
        if(kilometeresPerHour<0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour=toMilesPerHour(kilometeresPerHour);
            System.out.println(kilometeresPerHour + " km/h = "+ milesPerHour +" mi/h ");
        }

    }

    public static void main(String[] args) {
        printConversion(165);
    }
}
