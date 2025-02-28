import java.util.*;

public class CelsiusToFarenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celsius value: ");
		double celsius = sc.nextDouble();
		double farenheitResult = (celsius*9/5.0)+32;
		
		System.out.println("The " + celsius + " celsius is " + farenheitResult+" farenheit");
	}
}