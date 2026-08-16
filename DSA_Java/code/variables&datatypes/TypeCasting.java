public class TypeCasting {
    public static void main(String args[]){
        float a = 45.5f;
        // int b = a; //returns error because converting from float to int is not possible....
        int b = (int) a; //explicit type conversion, forcefully converting from float to int datatype....
        // System.out.println(b);

        char character1 = 'a'; 
        char character2 = 'b'; 

        System.out.println((int)character1);
        System.out.println((int)character2);
        System.out.println(character1 - character2);
    }   
}