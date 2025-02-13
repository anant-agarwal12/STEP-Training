import java.util.*;

class areaTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base and height of the triangle in cms: ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		
		double area_cms = 1/2.0*base*height;
		
		double area_inches = area_cms/(2.54*2.54);
		
		System.out.println("Area of the triangle in cms: " + area_cms);
		System.out.println("Area of the triangle in inches " + area_inches);
		}
	}
		
		