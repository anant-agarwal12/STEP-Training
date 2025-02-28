import java.util.*;

class operators{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int quotient = num1/num2;
		int remainder = num1%num2;
		
		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + num1 + " " + num2);
		}
	}