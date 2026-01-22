import java.util.Scanner;

class Guess{
    
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        char playAgain;

        do {
            System.out.println("\n Welcome to the Guessing Game!");
            int rand = (int)(Math.random() * 100) + 1;

            int num = -1;
            int count = 0;

            while (num != rand) {
                System.out.print("Enter your guess (1-100): ");

                if (!sc.hasNextInt()) {
                    System.out.println(" Invalid input! Please enter numbers only.");
                    sc.next(); // clear invalid input
                    continue;
                }

                num = sc.nextInt();
                count++;

                if (num < rand) {
                    System.out.println(" Enter bigger number");
                } else if (num > rand) {
                    System.out.println(" Enter smaller number");
                }
            }

            int score;
            if (count <= 3) score = 100;
            else if (count <= 5) score = 80;
            else if (count <= 7) score = 60;
            else score = 40;

            System.out.println("\n You won!");
            System.out.println("Number of guesses: " + count);
            System.out.println("Score: " + score);

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\n Thanks for playing!");
        sc.close();
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Guess.playGame();
    }
}
