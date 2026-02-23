


public class HintGeneration {
    /**
     * Generates hints based on how many hints have already been used. Hints provide
     * partial information without revealing the exact number.
     */
    public static String generateHint(int target, int hintCount) {
        if (hintCount == 1) {
            return (target % 2 == 0) ? "Hint: The number is even." : "Hint: The number is odd.";
        } else if (hintCount == 2) {
            return (target > 50)
                ? "Hint: The number is greater than 50."
                : "Hint: The number is less than or equal to 50.";
        } else {
            return "No more hints available.";
        }
    }
}
