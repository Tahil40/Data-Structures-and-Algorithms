import java.util.*;

public class BinaryToDecimal {
    public static void ConvertToDecimal(int number){
        int StartingNumber = number;
        int decimalNumber = 0; 
        int pow = 0; 

        while(number!=0){
            int last_number = number % 10; 
            decimalNumber = decimalNumber + (int) Math.pow(2, pow) * last_number;
            
            pow++; 
            number = number / 10; 
        };
        System.out.println("The Decimal Number of {"+ StartingNumber +"} is: "+ decimalNumber);
    };

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the Number; "); 
        int user_input = scanner.nextInt(); 
        ConvertToDecimal(user_input);
    }
}