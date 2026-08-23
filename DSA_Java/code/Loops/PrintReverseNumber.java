import java.util.*;

public class PrintReverseNumber {
    public static void main(String args[]) {
        System.out.print("Enter a Number; ");
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();

        // int last_digit = user_input % 10;
        // int new_number = user_input / 10;

        // System.out.println(last_digit);
        // System.out.println(new_number);

        int last_digit;
        System.out.print("The Reverse is; ");
        while (user_input > 0) {
            // returns the last digit of the number....
            last_digit = user_input % 10; 
            System.out.print(last_digit);

            // remove the last digit from the number....
            user_input = user_input / 10;   
        };
        System.out.println("");
    }
}