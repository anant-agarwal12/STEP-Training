import java.util.*;

public class conversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kms: ");
		double km;
		km = sc.nextInt();
		
		double miles;
		miles = km/1.6;
		
		System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	}
	
}