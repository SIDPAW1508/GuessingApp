
import java.util.Random;
import java.util.Scanner;
/**
 * Use Case 3: Hint Generation
 * This class is responsible for:
 * generating hints based on the number of incorrect attempts made by the player.
 */

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
            // Provide a hint after each incorrect guess, up to 2 hints
            if (attempts < 2) {
                String hint = HintGeneration.generateHint(config.getTargetNumber(), attempts + 1);
                System.out.println(hint);
            }
            attempts++;
        }
        if (attempts >= config.getMaxAttempts()){
            System.out.println("You've run out of attempts. The number was " + config.getTargetNumber());
        }

    }
}