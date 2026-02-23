/**
 * Use Case 1: Game Initialization
 * This class is responible for:
 * -Setting game boundaries
 * Generating a random target number
 * -Displaying game rules
 * 
 * Demonstrates:
 * Encapsulation 
 * Constructor Initialization
 * Random number generation
 */
import java.util.Random;
import java.util.Scanner;


/*Use Case 2: User Guess Submission
This class is responsible for:
Comparing the user's guess to the target number*
It does not handle input or output*/

public class GuessApp{
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        GameConfig config = new GameConfig();
        config.showRules();
        Scanner scanner =new Scanner(System.in);
        int attempts = 0;
        while (attempts < config.getMaxAttempts()){
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            String result = GuessValidator.validateGuess(userGuess, config.getTargetNumber());
            System.out.println(result);
            if (result.equals("CORRECT!")){
                break;
            }
            attempts++;
        }
        if (attempts >= config.getMaxAttempts()){
            System.out.println("You've run out of attempts. The number was " + config.getTargetNumber());
        }

    }
}