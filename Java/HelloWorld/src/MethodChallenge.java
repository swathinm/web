import java.util.Scanner;

public class MethodChallenge {
    
    public static void displayHighScorePosition(String name,int highscore){
        System.out.println(name+" managed to get into position "+highscore+" on the high score list");
    }

   /* public static int calculateHighScorePosition(int playersScore){
        if(playersScore>=1000){
            return 1;
        } else if (playersScore>=500&&playersScore<1000) {
            return 2;
        } else if (playersScore>=100&&playersScore<500) {
            return 3;
        } else {
            return 4;
        }

    }*/
    public static int calculateHighScorePosition(int playersScore) {
        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500 && playersScore < 1000) {
            position = 2;
        } else if (playersScore >= 100 && playersScore < 500) {
            position = 3;
        }
        return position;
        }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int highScore=calculateHighScorePosition(s.nextInt());
        String d=s.next();
//        int highScore=calculateHighScorePosition(150);
        displayHighScorePosition(d,highScore);

    }
}
