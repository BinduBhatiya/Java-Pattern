import  java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter value: ");

            int val = obj.nextInt();

            for (int i = 0; i < val; i++) {
                for (int k = val-1; k >= i ; k--) {
                    System.out.print(" ");
                }
                int num = 1;
                for (int j = 0; j < i+1; j++) {
                    System.out.print(num+" ");
                    num = num * (i-j)/(j+1);
                }
                System.out.println("");
            }
        }
    }
}


/*

Enter value: 5

     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

*/