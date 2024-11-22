import  java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        try (Scanner obj = new  Scanner(System.in)) {
            System.out.print("Enter value: ");

            int val = obj.nextInt();

            for (int i = 1; i <= val; i++) {
                for (int k = val-1; k >=i ; k--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <=i*2-1 ; j++) {
                    if (j % 2 == 0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
                System.out.println("");
            }
            for (int i = 1; i <= val; i++) {
                for (int k = 1; k <= i ; k++) {
                    System.out.print("  ");
                }
                for (int j = val*2-3 ; j >= i*2-1; j--) {
                    if (j % 2 == 0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
                System.out.println("");
            }
        }  
    }
}


/*
output : 

Enter value: 5
        1 
      1 0 1 
    1 0 1 0 1 
  1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 
  1 0 1 0 1 0 1 
    1 0 1 0 1 
      1 0 1
        1

 */