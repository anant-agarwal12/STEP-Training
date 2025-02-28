import java.util.*;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        
        System.out.print("Enter a number (0 to stop): ");
        while ((number = sc.nextDouble()) != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
        }
        
        System.out.println("Total sum: " + total);
    }
}
