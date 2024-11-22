import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");
            
            int val = obj.nextInt();
            

            for (int i = 1; i <= val; i++) {
                for (int k = val-1; k >=i ; k--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <=i*2-1 ; j++) {
                    System.out.print(" "+j);
                }
                System.out.println("");
            }
            for (int i = 1; i <= val; i++) {
                for (int k = 1; k <= i ; k++) {
                    System.out.print("  ");
                }
                int num = 1;
                for (int j = val*2-3 ; j >= i*2-1; j--) {
                    System.out.print(" "+num);
                    num+=1;
                }
                System.out.println("");
            }
        }
    }
}


/*

Enter Value: 5

         1
       1 2 3
     1 2 3 4 5
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7
     1 2 3 4 5
       1 2 3
         1
 */
