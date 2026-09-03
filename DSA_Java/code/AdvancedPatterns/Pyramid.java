public class Pyramid{
    public static void Inverted_Half_Pyramid(int totalRows, int totalColumns){
        for(int i=1; i<=totalRows; i++){
            for(int j=1; j<=totalColumns; j++){
                if(i==totalRows || j==totalColumns || (i==3 && (j==2 || j==3 || j==4)) || (i==2 && (j==3 || j==4)) || (i==1 && (j==4))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            };
            System.out.println(" ");
        };
    };

    public static void main(String args[]){
        Inverted_Half_Pyramid(4, 4);
    };
};