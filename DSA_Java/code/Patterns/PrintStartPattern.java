public class PrintStartPattern {
    public static void main(String args[]) {
        // print start pattern....
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.err.println("\n");
        // print inverted start pattern....
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.err.println("\n");
        // print half-pyramid pattern....
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.err.println("\n");
        // print character pattern....
        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                System.out.println("A");
            }
            ;
            if (i == 2) {
                System.out.println("BC");
            }
            ;
            if (i == 3) {
                System.out.println("DEF");
            }
            ;
            if (i == 4) {
                System.out.println("GHIJ");
            }
            ;
        }
    }
}