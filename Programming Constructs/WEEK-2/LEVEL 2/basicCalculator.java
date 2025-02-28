import java.util.*;

class basicCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add = num1+num2;
		int subtract = num1-num2;
		int multiply = num1*num2;
		double division = num1*1.0/num2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is " + add + " " + subtract + " " + multiply + " " + division);
		}
	}
		