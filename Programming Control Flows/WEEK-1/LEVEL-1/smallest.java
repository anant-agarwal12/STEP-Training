import java.util.Scanner;

class smallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the 3rd number: ");
		int num3 = sc.nextInt();
		
		if(num1<num2 && num1<num3)
			System.out.print(num1+" is the smallest number");
		else
			System.out.print(num1+" is not the smallest number");
		}
	}