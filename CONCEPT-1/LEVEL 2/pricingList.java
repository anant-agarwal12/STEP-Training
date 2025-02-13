import java.util.*;

class pricingList{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the unit price of the item and the quantity to be bought: ");
		double unitPrice = sc.nextDouble();
		double quantity = sc.nextDouble();
		
		double totalPrice = unitPrice*quantity;
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
		}
	}