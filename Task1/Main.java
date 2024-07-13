package Encryptix.Task1;
import java.util.*;
class RandomNumberGenerator
{

    static int randomNumber()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Random integer between 1 and 100


        return randomNumber;
    }
    static int userGuess()
    {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your guess :");
        int userGuess=sc.nextInt();

        return userGuess;
    }

    static void compareUserGuess()
    {
        RandomNumberGenerator rnd1=new RandomNumberGenerator();

        if(rnd1.userGuess()>rnd1.randomNumber())
        {
            System.out.println("Guess is too high");
        }
        else if(userGuess()<randomNumber())
        {
            System.out.println("Guess is too high");
        }

        System.out.println("Well the number was :"+randomNumber());
    }
}


public class Main extends RandomNumberGenerator

{
    public static void main(String[] args)
    {
        RandomNumberGenerator rnd1=new RandomNumberGenerator();


        rnd1.compareUserGuess();
    }

}
