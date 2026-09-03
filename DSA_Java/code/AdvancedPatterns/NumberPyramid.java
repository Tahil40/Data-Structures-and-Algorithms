public class NumberPyramid {
    public static void InvertedHalfNumberPyramid(int length){
        for(int i=length; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                System.out.print(" ");
            }; 
            System.out.println();
        };
    };

    public static void main(String args[]){
        InvertedHalfNumberPyramid(5);
    }
};