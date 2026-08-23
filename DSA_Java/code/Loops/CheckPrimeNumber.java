import java.util.*;

public class CheckPrimeNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number; ");
        int number = scanner.nextInt();

        if (number == 2) {
            System.out.println("The Number is Prime");
        } else {
            boolean isBooleanNumber = false;
            // number-1 -> points to second last number....
            // for (int i = 2; i <= number - 1; i++) {
            //     // the prime number can only have two factors the 1 and the number itself....
            //     if (number % i == 0) {
            //         // if the number is fully divisible by any other number then it is not a prime number....
            //         isBooleanNumber = false;
            //     };
            // };
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // the prime number can only have two factors the 1 and the number itself....
                if (number % i == 0) {
                    // if the number is fully divisible by any other number then it is not a prime number....
                    isBooleanNumber = false;
                };
            };
            if (isBooleanNumber == true) {
                System.out.println("The Number is Prime; ");
            } else {
                System.out.println("The Number is Not Prime");
            };
        };
    };
};