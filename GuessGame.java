import java.util.Scanner;
import java.util.Random;

public class GuessGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess a number from 1 to 100");

        while(guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess > number) {
                System.out.println("Your guess is Too High. Try again.");
            }
            else if(guess < number) {
                System.out.println("Your guess is Too Low. Try again.");
            }
            else {
                System.out.println("Congratulations! Your guess is Correct.");
                System.out.println("Total attempts taken: " + attempts);
            }
        }
    }
}