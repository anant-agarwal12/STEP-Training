import java.util.*;

public class height{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height in cms: ");
		int height = sc.nextInt();
		
		double height_feet = height/(12*2.54);
		double height_inches = height/2.54;
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + height_feet + " and inches is " + height_inches);
	}
}