package packages.StringManipulationsSorular;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();

        boolean isValid = true;
        StringBuilder invalidConditions = new StringBuilder("Invalid conditions: ");

        // Condition 1: First char should be lowercase
        if (!Character.isLowerCase(password.charAt(0))) {
            isValid = false;
            invalidConditions.append("First char should be lowercase, ");
        }

        // Condition 2: Last char should be a number
        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            isValid = false;
            invalidConditions.append("Last char should be a number, ");
        }

        // Condition 3: Password should not contain a space
        if (password.contains(" ")) {
            isValid = false;
            invalidConditions.append("Password should not contain a space, ");
        }

        // Condition 4: Password should be minimum 10 characters
        if (password.length() < 10) {
            isValid = false;
            invalidConditions.append("Password should be minimum 10 characters, ");
        }

        if (isValid) {
            System.out.println("Successful password!");
        } else {
            String invalidConditionsString = invalidConditions.toString().trim();
            System.out.println(invalidConditionsString.substring(0, invalidConditionsString.length() - 1));
        }

    }
}
