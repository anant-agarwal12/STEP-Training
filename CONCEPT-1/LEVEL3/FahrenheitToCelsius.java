import java.util.*;

public class FahrenheitToCelsius{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fahrenheit value: ");
		double fahrenheit = sc.nextDouble();
		double celsiusResult = (fahrenheit-32)*5/9.0;
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult+" celsius");
	}
}