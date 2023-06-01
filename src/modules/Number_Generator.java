package modules;
import java.util.Random;
public class Number_Generator
{
    public static int num()
    {
        Random rand = new Random();

        // Generates a Number between [0-999]
        int number = rand.nextInt(1000);

        // Add 1 to get [1-1000]
        number++;

        return number;
    }

}
