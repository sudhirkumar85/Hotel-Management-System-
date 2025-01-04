package generator;

import java.util.Random;

public class PasswordGenerator {

    static Random random = new Random();

    static public String generatePassword() {

        String password = "";
        for (int i = 1; i <= 6; i++) {
           password = password + random.nextInt(10);
        }
        return password;
    }

}
