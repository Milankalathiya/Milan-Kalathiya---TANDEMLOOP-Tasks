import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /*

        With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
        Output: (examples)
            1) input a = 1, then output : 1
            2) input a = 2, then output : 1, 3
            3) input a = 3, then output : 1, 3, 5
            4) input a = 4, then output : 1, 3, 5, 7
        
        */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(b);
            if (i < a) {
                System.out.print(", ");
            }
            b += 2;
        }
    }
}
