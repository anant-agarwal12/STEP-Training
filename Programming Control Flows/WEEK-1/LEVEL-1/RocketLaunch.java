import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        
        System.out.println("Lift off!");
    }
}