
import java.util.Scanner;

class Chocolates{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter number of children: ");
       int children = input.nextInt();
       System.out.printf("Enter number of chocolates: ");
       int chocolates = input.nextInt();

       int perChocolate = chocolates/children; 

       
       int leftChocolate = chocolates%children; 
       
       
       System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d.", perChocolate, leftChocolate);
	   }		
	}
