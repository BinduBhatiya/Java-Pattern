import  java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int n = obj.nextInt();
                // height of the upper half (changeable)
                    
                    // Upper half of the diamond
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("1");
                        if (i > 1) {
                            for (int j = 1; j < (2 * i - 2); j++) {
                                System.out.print(" ");
                            }
                            System.out.print("1");
                        }
                        System.out.println();
                    }
            
                    // Lower half of the diamond
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = n; j > i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("1");
                        if (i > 1) {
                            for (int j = 1; j < (2 * i - 2); j++) {
                                System.out.print(" ");
                            }
                            System.out.print("1");
                        }
                        System.out.println();
                    }
        }
    }
        
        
}

/*

Enter Value: 5

    1
   1 1
  1   1
 1     1
1       1
 1     1
  1   1
   1 1
    1
    
*/
