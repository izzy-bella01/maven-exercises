import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        Scanner mcScanner = new Scanner(System.in);
        String userInput = mcScanner.nextLine();

        System.out.println("You entered: " + userInput);
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("Your input: " +  userInput + " is a number");
        } else {
            System.out.println("Your input: " +  userInput + " is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
