
import java.util.Scanner;

class SwapNumber{
    public static void main(String [] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
    
		int num1  = input.nextInt();

		System.out.printf("Enter 2nd Number:");
    
		int num2  = input.nextInt();

		int temp;   
    
		temp = num1;
		num1 = num2;
		num2 = temp;

    
    System.out.printf("The swapped numbers are %d and %d.",num1, num2 );
	}
}
