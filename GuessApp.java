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

public class GuessApp {
    public static void main(String[] args) {
        GameConfig config = new GameConfig();
        config.showRules();
        // Further game logic would go here (e.g., handling user input, tracking attempts, providing hints)
    }
}