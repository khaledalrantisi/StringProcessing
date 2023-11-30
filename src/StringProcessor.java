public class StringProcessor {

    /**
     * Checks if the provided password is strong.
     * A strong password must contain at least one uppercase letter,
     * one lowercase letter, one digit, and one special symbol.
     *
     * @param password The password to be checked.
     * @return true if the password is strong; otherwise, false.
     */
    public boolean isStrongPassword(String password) {
        // Regular expressions to check password strength
        String uppercaseRegex = ".*[A-Z].*";
        String lowercaseRegex = ".*[a-z].*";
        String digitRegex = ".*\\d.*";
        String specialCharRegex = ".*[^A-Za-z0-9].*";

        return password.matches(uppercaseRegex) &&
                password.matches(lowercaseRegex) &&
                password.matches(digitRegex) &&
                password.matches(specialCharRegex) &&
                password.length() >= 8; // Assuming the minimum length is 8 characters
    }

    /**
     * Counts the number of digits in the given sentence.
     *
     * @param sentence The sentence in which digits are counted.
     * @return The count of digits in the sentence.
     */
    public int calculateDigits(String sentence) {
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    /**
     * Calculates the number of words in the given sentence.
     * Words are considered separated by spaces.
     *
     * @param sentence The sentence in which words are counted.
     * @return The count of words in the sentence.
     */
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        // Splitting the sentence by spaces to count words
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    /**
     * Given a string containing an expression with numbers,
     * arithmetic operations, and brackets, calculates and
     * returns the result of the expression.
     * You can assume a valid and well-formed expression.
     *
     * @param expression The expression to be evaluated.
     * @return The result of the expression evaluation.
     */
    public double calculateExpression(String expression) {
        return evaluateExpression(expression);
    }

    // Helper method to evaluate arithmetic expressions using recursion
    private double evaluateExpression(String expression) {
        // Logic to evaluate the expression - this is just a placeholder
        // You might need to implement a full-fledged expression evaluation logic here
        return 0.0; // Placeholder return
    }

    // Main method for testing
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        // Test cases for isStrongPassword method
        System.out.println("Test Cases for isStrongPassword method:");
        System.out.println("Test Case 1: Password 'Abc123#$' is strong: " + processor.isStrongPassword("Abc123#$"));
        System.out.println("Test Case 2: Password 'pass' is strong: " + processor.isStrongPassword("pass"));
        // Add more test cases here...

        // Test cases for calculateDigits method
        System.out.println("\nTest Cases for calculateDigits method:");
        System.out.println("Test Case 1: Digits in 'Hello123': " + processor.calculateDigits("Hello123"));
        System.out.println("Test Case 2: Digits in 'NoDigits': " + processor.calculateDigits("NoDigits"));
        // Add more test cases here...

        // Test cases for calculateWords method
        System.out.println("\nTest Cases for calculateWords method:");
        System.out.println("Test Case 1: Words in 'This is a test': " + processor.calculateWords("This is a test"));
        System.out.println("Test Case 2: Words in 'SingleWord': " + processor.calculateWords("SingleWord"));
        // Add more test cases here...

        // Test cases for calculateExpression method
        System.out.println("\nTest Cases for calculateExpression method:");
        System.out.println("Test Case 1: Result of expression '2 + 3 * (4 - 1)': " + processor.calculateExpression("2 + 3 * (4 - 1)"));
        System.out.println("Test Case 2: Result of expression '10 / 5 - 1': " + processor.calculateExpression("10 / 5 - 1"));
        // Add more test cases here...
    }
}
