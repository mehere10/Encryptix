package Encryptix.AllTask.Task1_NumberGuessingGame;
import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // inputs.
        int userGuess;
        int score = 0;
        int attemptLimit = 10;
        int minRange = 1;
        int maxRange = 100;

        boolean playAgain = false;

        while (true) {
            int numberToGuess = rand.nextInt(maxRange - minRange + 1) + minRange;
            int attempt = 0;
            boolean guessCorrectly = false;

            System.out.println("Welcome to the number game !");
            System.out.println("Press 1 to know the rules , else press any number to continue.");
            int userChoice = sc.nextInt();

            if (userChoice == 1)
            {


                System.out.println("The rules for the game are following :");
                System.out.println("1.You have " + attemptLimit + " number of attempts to guess the number.");
                System.out.println("2.For guessing the correct answer within the limit you will be given a point.");

            } else if (userChoice != 1) {


                System.out.println("There is a number between " + minRange + " and " + maxRange + " .");
                //System.out.println("The number is :" + numberToGuess);
                while (attempt < attemptLimit && !guessCorrectly) {


                    System.out.println("Enter your guess.");
                    userGuess = sc.nextInt();

                    if (userGuess < minRange || userGuess > maxRange) {
                        System.out.println("Plz enter a number within the range specified .");
                    }
                    attempt++;

                    if (userGuess == numberToGuess) {
                        System.out.println("Congratulations , you guessed the correct number.");
                        System.out.println("Your score is +" + (score += attemptLimit - attempt + 1));
                        guessCorrectly = true;
                    } else if (userGuess < numberToGuess) {
                        System.out.println("Too low , try again with a greater number .");
                    } else {
                        System.out.println("Too high , try with low number");
                    }
                }

                if (guessCorrectly == false) {
                    System.out.println("Sorry u ran out of attempts !.");
                }

                System.out.println("Your score is :" + score);


                System.out.println("Do you want to play another game (yes/no).");
                String playAgainChoice = sc.next().toLowerCase();
                String c1 = "yes";
                String c2 = "no";


                if (playAgainChoice.equals(c2))     // if user don't want to play again
                {
                    //playAgain=true;
                    System.out.println("Thank you for playing the guessing game.");
                    System.out.println("--- XXXXXXXXXXX ---");
                    break;
                } else if (playAgainChoice.equals(c1)) {
                    System.out.println("--- XXXXXXXXXXX ---");
                    System.out.println("New Game.");
                    continue;
                }
            }
        }
    }
}

