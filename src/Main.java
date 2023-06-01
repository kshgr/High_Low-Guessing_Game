import modules.Number_Generator;
import modules.Computer_Response;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Variable Declaration
        int guess, num, num_guesses;

        // Generation of Random Number
        num = Number_Generator.num();
        System.out.println("A Random Number between 1-1000 (inclusive) has been Generated.");

        // Set-up Input Scanner
        Scanner scanner = new Scanner(System.in);

        // First Guess
        System.out.print("Guess a number: ");
        guess = scanner.nextInt();
        num_guesses = 1;
        Computer_Response.response(num, guess);

        while (guess != num)
        {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            num_guesses++;
            Computer_Response.response(num, guess);

        }
        scanner.close();

        System.out.println("You took only " + num_guesses + " guesses!");
    }
}