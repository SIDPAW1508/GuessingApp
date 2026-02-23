
import java.util.Random;
import java.util.Scanner;

public class GuessApp{
    public static void main(String[] args) throws InvalidGuessException {
        Scanner scanner = new Scanner(System.in);
        boolean restart;
        System.out.println("Welcome to the Guessing Game!");
        do {
            System.out.print("enter name:");
            String playerName = scanner.nextLine();
            GameConfig config = new GameConfig();
            config.showRules();
            int attempts = 0;
            int hintsUsed = 0;
            boolean win = false;
            while (attempts < config.getMaxAttempts()) {
                System.out.print("Enter your guess: ");
                int guess = ValidationService.validateInput(scanner.nextLine());
                String result = GuessValidator.validateGuess(guess, config.getTargetNumber());
                System.out.println(result);
                if (result.equals("CORRECT!")) {
                    win = true;
                    break;
                }
                // Provide a hint after each incorrect guess, up to 2 hints
                if (attempts < 2) {
                    String hint = HintGeneration.generateHint(config.getTargetNumber(), attempts + 1);
                    System.out.println(hint);
                }
                attempts++;
            }
            if (attempts >= config.getMaxAttempts()) {
                System.out.println("You've run out of attempts. The number was " + config.getTargetNumber());
            }
            StorageService.saveResult(playerName, attempts, win);
            restart = GameController.restartGame(scanner);
        } while (restart);
    }
}