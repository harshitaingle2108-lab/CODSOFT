package NumberGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {

            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\n===== Number Guessing Game ===== ");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);
                    guessed = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Too High!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("Game Over!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}

