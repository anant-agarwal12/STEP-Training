import java.util.*;

class feetConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the distance in feets: ");
		double distanceFeet = sc.nextDouble();
		double distanceYard = distanceFeet/3;
		double distanceMile = distanceYard/1760;
		
		System.out.println("The distance in miles is: " + distanceMile);
		System.out.println("The distance in yard is: " + distanceYard);
		}
	}
		