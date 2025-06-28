public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += levelsCompleted*bonus;
            System.out.println(finalScore);
        }


        finalScore = 10000;
        levelsCompleted = 8;
        bonus = 200;

        if (gameOver) {
            finalScore += levelsCompleted*bonus;
            System.out.println(finalScore);
        }

    }
}
