
/**
 * handles validation of user inut before it is used in game logic
 * all input checks are centralized
 * to keep main() clean and focused.
 */
public class ValidationService{
    public static int validateInput(String input) throws InvalidGuessException {
        try {
            int value = Integer.parseInt(input);
            if (value < 1 || value > 100) {
                throw new InvalidGuessException("Guess must be between 1 and 100.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InvalidGuessException("Invalid input. Please enter a number.");
        }
    }
}