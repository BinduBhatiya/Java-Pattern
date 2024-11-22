import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        try (Scanner obj = new  Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int val = obj.nextInt();
            int val2 = val + 1;

            for (int i = 1; i <= val2; i++) {
                for (int k = val2; k > i; k--) {
                    System.out.print("   ");                    
                }
                for (int j = 1; j <= i*2-1; j++) {
                    if(i == val2 && j == val2)
                    {
                        System.out.print("   ");
                    }
                    else
                    {
                        System.out.print("*"+" "+" ");
                    }
                }
                System.out.println(" ");
            }
            for (int i = 1; i < val2; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("   ");
                }
                for (int j = val2*2-3; j >= i*2-1; j--) {
                    System.out.print("*"+" "+" " );
                }
                System.out.println(" ");
            }
        }
    }
}
