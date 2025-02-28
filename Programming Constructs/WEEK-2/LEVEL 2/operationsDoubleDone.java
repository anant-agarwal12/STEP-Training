import java.util.*;
public class operationsDoubleDone{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the three numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double op1 = a+b*c;
		double op2 = a*b+c;
		double op3 = c+a/b;
		double op4 = a%b+c;
		
		System.out.println("a+b*c: " + op1);
		System.out.println("a*b+c: " + op2);
		System.out.println("c+a/b: " + op3);
		System.out.println("a%b+c: " + op4);
		}
	}
		