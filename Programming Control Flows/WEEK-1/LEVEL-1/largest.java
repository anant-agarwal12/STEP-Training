import java.util.Scanner;

class largest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the 3rd number: ");
		int num3 = sc.nextInt();
		
		int largest = 0;
		
		
		
		if(num1>num2&&num1>num3)
			largest = num1;
		else if(num2>num1&&num2>num3)
			largest = num2;
		else
			largest = num3;
			
			
		
		if(largest == num1)
			System.out.println("Is the first number the largest? Yes");
		else
			System.out.println("Is the first number the largest? No");
			
			
		if(largest == num2)
			System.out.println("Is the second number the largest? Yes");
		else
			System.out.println("Is the second number the largest? No");
			
			
		if(largest == num3)
			System.out.println("Is the third number the largest? Yes");
		else
			System.out.println("Is the third number the largest? No");
	}
	
}