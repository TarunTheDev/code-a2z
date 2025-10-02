public class PasswordStrengthChecker {

    // Function: check strength of a password
    public static String checkStrength(String password) {
        if (password == null || password.isEmpty()) {
            return "Invalid password";
        }

        int score = 0;

        // Length check
        if (password.length() >= 8) score++;
        // Contains uppercase
        if (password.matches(".*[A-Z].*")) score++;
        // Contains lowercase
        if (password.matches(".*[a-z].*")) score++;
        // Contains digit
        if (password.matches(".*[0-9].*")) score++;
        // Contains special character
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        // Decide strength
        switch (score) {
            case 5: return "Very Strong";
            case 4: return "Strong";
            case 3: return "Medium";
            case 2: return "Weak";
            default: return "Very Weak";
        }
    }

    // Demo usage
    public static void main(String[] args) {
        System.out.println(checkStrength("hello"));            // Very Weak
        System.out.println(checkStrength("Hello123"));         // Medium
        System.out.println(checkStrength("Hello@123"));        // Very Strong
    }
}
