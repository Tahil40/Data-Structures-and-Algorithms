import java.util.*;

public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the Number; "); 
        int user_input = scanner.nextInt(); 
         
        int decimalNumber = 0; 
        int pow = 0; 
        while(user_input!=0){
            int last_number = user_input % 10; 
            decimalNumber = decimalNumber + (int) Math.pow(2, pow) * last_number;
            
            pow++; 
            user_input = user_input / 10; 
        };
        System.out.println("The Decimal Number is: "+ decimalNumber);
    }
}