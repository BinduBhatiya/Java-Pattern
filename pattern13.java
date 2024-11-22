import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");
            
            int val = obj.nextInt();

            for (int i = 1; i <= val; i++){
                for (int j = i; j >= 1; j--) {
                    System.out.print(j+" ");
                }

                for (int k = (val-1); k >=i ; k--) {
                    System.out.print("  ");
                }
                for (int k = (val-1); k >=i ; k--) {
                    System.out.print("  ");
                }

                for (int j = 1; j <= i; j++) {
                        System.out.print(j+" ");
                }
                System.out.println("");
            }

            for (int i = 1; i < val; i++){
                for (int j = val; j > i; j--) {
                    System.out.print(j+" ");
                }

                for (int k = 0; k < i ; k++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i ; k++) {
                    System.out.print("  ");
                }
                
                for (int j = i+1; j <= val; j++) {
                        System.out.print(j+" ");
                }
                
                System.out.println("");
            }
        }
    }
}


/*

1                 1 
2 1             1 2
3 2 1         1 2 3
4 3 2 1     1 2 3 4
5 4 3 2 1 1 2 3 4 5
5 4 3 2     2 3 4 5
5 4 3         3 4 5
5 4             4 5
5                 5

*/
