import java.util.Scanner;

class SimpleInterest{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter Principal Amount: ");
       int principalAmount = input.nextInt();
       System.out.println("Enter Interest Rate: ");
       double interestRate = input.nextDouble();
       System.out.println("Enter Time in months: ");
       int time = input.nextInt();

       double simpleInterest = principalAmount * interestRate * time / 100 ; 
       
       System.out.printf("The Simple Interest is "+simpleInterest+" for Principal "+principalAmount+" , Rate of Interest "+interestRate+" and Time "+time+" months.");
	   }
	}