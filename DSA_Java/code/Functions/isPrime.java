import java.util.*;

public class isPrime {
    public static boolean isPrime(int number){
        boolean isPrime = true; 
        if(number==2){
            isPrime = true; 
            return isPrime; 
        }else{
            for(int i=2; i<=Math.sqrt(number); i++){
                if(number%i==0){
                    isPrime = false; 
                    return isPrime;
                }
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int user_input = scanner.nextInt();
        System.out.println(isPrime(user_input));
    }
}