public class HollowRectanglePattern{
    public static void hollow_rectangle_pattern(int totalRows, int totalColumns){
        // printing rows....
        for(int i=1; i<=totalRows; i++){
            // printing columns....
            for(int j=1; j<=totalColumns; j++){
                // to create hollow rectangle pattern only print stars in 1st, 4th row and 1st, 5th column....
                if(i==1 || i==totalRows || j==1 || j==totalColumns){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            };
            //to make sure that each next row will start from new line....
            System.out.println("");
        };
    };

    public static void main(String args[]){
        hollow_rectangle_pattern(4, 5);
    }
}