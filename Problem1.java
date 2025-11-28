import java.util.Scanner;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next(); 
        
        double result = 0;
        
        if (operation.equals("+")) {
            result = a + b;
        }
        else if (operation.equals("-")) {
            result = a - b;
        }
        else if (operation.equals("*")) {
            result = a * b;
        }
        else if (operation.equals("/")) {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return; 
            }
        }
        else {
            System.out.println("Invalid operation");
            return;
        }
        
        System.out.println(result);
    }
}