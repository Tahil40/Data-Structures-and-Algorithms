import java.util.*;

public class DecimalToBinary {
    public static void ConvertToBinary(int number){
        int StartingNumber = number;
        int power = 0; 
        int binaryNumber = 0; 
        
        while(number!=0){
            int reminder = number % 2;
            binaryNumber = binaryNumber + (reminder * (int) Math.pow(10, power));//this method will concatinate numbers during addition....
            System.out.println("Binary Number is; "+ binaryNumber);
            power++; 
            number = number / 2; 
        }; 
        System.out.println("The Binary Number of {"+ StartingNumber +"} is: "+ binaryNumber);
    };

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter The Number; ");
        int input_number = scanner.nextInt();
        ConvertToBinary(input_number);
    };
};