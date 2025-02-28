import java.util.*;

public class SumNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }
        
        int sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }
        
        int sumFormula = n * (n + 1) / 2;
        
        System.out.println("Sum using for loop: " + sumForLoop);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumForLoop == sumFormula) {
            System.out.println("Both computations match.");
        } else {
            System.out.println("There is a discrepancy in computations.");
        }
    }
}