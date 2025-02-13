import java.util.*;

public class universityDiscount{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fees: ");
		int fee = sc.nextInt();
		System.out.print("Enter the discount percent: ");
		int discountPercent = sc.nextInt();
		double discount = fee*discountPercent/100.0;
		double discountPrice = fee-discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR "  + discountPrice);
	}
	

}	