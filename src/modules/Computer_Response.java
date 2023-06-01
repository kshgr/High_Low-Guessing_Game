package modules;

public class Computer_Response
{
    public static void response(int num, int guess)
    {
        int difference = guess - num;

        // Too Low
        if (difference < -100)
        {
            System.out.println("Your Guess is Too Low. Try Again!");
        }
        // Low
        else if (-100 <= difference && difference < 0)
        {
            System.out.println("Your Guess is Low. Try Again!");
        }
        // High
        else if (0 < difference && difference <= 100)
        {
            System.out.println("Your Guess is High. Try Again!");
        }
        // Too High
        else if (100 < difference)
        {
            System.out.println("Your Guess is Too High. Try Again!");
        }
        else
        {
            System.out.println("You Guessed the Number!!");
        }
    }
}
