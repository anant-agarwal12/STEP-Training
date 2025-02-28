public class volume{
	public static void main(String args[]){
		double pi = 3.14;
		int radius_kms = 6378;
		double radius_miles = 3963.105;
		
		double volume_kms = 4/3*pi*radius_kms*radius_kms*radius_kms;
		double volume_miles = 4/3*pi*radius_miles*radius_miles*radius_miles;
		
		System.out.println("The volume of earth in cubic kilometers is " + volume_kms + " and cubic miles is " + volume_miles);
	}
		
}