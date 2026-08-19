public class PrintSquarePattern{
    public static void main(String args[]){
        // method -> 1
        // for(int i=0; i<=3; i++){
        //     for(int j=0; j<=3; j++){
        //         System.out.print("*");
        //     }; 
        //     System.out.println(" ");
        // };

        //method -> 2
        // for(int i=1; i<=4; i++){
        //     System.out.println("****");
        // };

        //method -> 3
        int i=1; 
        while(i<=4){
            System.out.println("****");
            i++; 
        }
    }
};