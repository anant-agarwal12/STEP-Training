import java.util.*;
public class operationsDone{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int op1 = a+b*c;
		int op2 = a*b+c;
		int op3 = c+a/b;
		int op4 = a%b+c;
		
		System.out.println("a+b*c: " + op1);
		System.out.println("a*b+c: " + op2);
		System.out.println("c+a/b: " + op3);
		System.out.println("a%b+c: " + op4);
		}
	}
		