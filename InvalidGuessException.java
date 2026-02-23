
/*
Custom exception used when user input fails validation.
This allows the game to fail gracefully and provide feedback to the user without crashing the application.
*/
public class InvalidGuessException extends Exception {
    public InvalidGuessException(String message) {
        super(message);
    }
}