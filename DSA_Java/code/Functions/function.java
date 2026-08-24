import java.util.*;

public class function {
    // declare function which print hello world....
    public static void PrintHelloWorld(){
        System.out.println("Hello World");
    }; 

    // declare Add function which takes two parameters or formal parameters....
    public static int Add(int number1, int number2){
        int sum = number1 + number2; 
        return sum; 
    };

    // declare a swap function to swap two values....
    public static void swap(int number1, int number2){
        System.out.println("Numbers before swap; " + "(" + number1 + "," + number2 + ")");
        int x = number1; 
        number1 = number2; 
        number2 = x; 
        System.out.println("Numbers before swap; " + "(" + number1 + "," + number2 + ")");
    };

    // declare a factorial function to find the factorial of a number....
    public static int factorial(int number){
        if(number == 1){
            return 1; 
        };
        return number * factorial(number - 1);
    };

    public static void main(String args[]){
        // call a function with it's name....
        // PrintHelloWorld();
        // Scanner scanner = new Scanner(System.in); 

        // System.out.print("Enter First Number; ");
        // int number1 = scanner.nextInt();
        
        // System.out.print("Enter Second Number; ");
        // int number2 = scanner.nextInt(); 

        // // call a add function and passes two arguments or actual parameters....
        // int function_output = Add(number1, number2); 
        // System.out.println("The Sum is; "+ function_output);

        // swap(5, 10);

        int factorial_value = factorial(2);
        System.out.println("The Factorial is; "+ factorial_value);
    };
};