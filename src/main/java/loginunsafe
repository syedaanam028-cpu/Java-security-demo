import java.util.Random;

public class LoginUnsafe {
    public static void main(String[] args) {

        // Hardcoded password (security issue)
        String password = "123456";

        // Weak random number generator (security issue)
        Random rand = new Random();
        int token = rand.nextInt();

        System.out.println("Generated token: " + token);
        System.out.println("Password is: " + password);
    }
}
