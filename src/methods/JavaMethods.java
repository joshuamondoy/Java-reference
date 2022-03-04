package methods;

public class JavaMethods {
    public static void main(String[] args) {

        int highScore1 = calculateScore(800, 5, 100, true); //passed the argument here
        int highScore2 = calculateScore(10000, 8, 200, true); //passed the argument here

        System.out.println("Your final score was " + highScore1);
        System.out.println("Your final score was " + highScore2);

        //challenge
        int highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Joshua",highScorePosition);

    }

    //expect parameters here from method main
    public static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1; //negative 1 means invalid value
        }
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
