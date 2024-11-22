public class pattern16 {
    public static void main(String[] args) {
        int val = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val+" ");
                val--;
            }
            System.out.println(" ");
            val = val - 1;
        }
    }
}


/*

5  
3 2
0 -1 -2
-4 -5 -6 -7
-9 -10 -11 -12 -13 

*/