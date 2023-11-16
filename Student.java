package application;
import java.util.Random;
import java.util.Scanner;
public class Student {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int maxAttempts = 10;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I've selected a random number between " + minRange + " and " + maxRange + ". Try to guess it!");

	        boolean playAgain = true;

	        while (playAgain) {
	            int targetNumber = random.nextInt(maxRange) + minRange;
	            int attempts = 0;
	            boolean hasGuessedCorrectly = false;

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
	                int userGuess = scanner.nextInt();

	                if (userGuess < minRange || userGuess > maxRange) {
	                    System.out.println("Please guess within the range " + minRange + " and " + maxRange + ".");
	                } else if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
	                    hasGuessedCorrectly = true;
	                    score++;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Try a higher number.");
	                } else {
	                    System.out.println("Try a lower number.");
	                }

	                attempts++;
	            }

	            if (!hasGuessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
	            }

	            System.out.print("Do you want to play another round? (yes/no): ");
	            String playAnotherRound = scanner.next().toLowerCase();
	            playAgain = playAnotherRound.equals("yes") || playAnotherRound.equals("y");
	        }

	        System.out.println("Thanks for playing! Your final score is: " + score + " rounds won.");
	    }
}
