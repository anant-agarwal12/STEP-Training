import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        float amarHeight = sc.nextFloat();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        float akbarHeight = sc.nextFloat();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        float anthonyHeight = sc.nextFloat();

        String youngest;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
