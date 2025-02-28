import java.util.Scanner;

class weights{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.printf("Enter Weight in pounds:");
       
       double weight_pds = input.nextDouble();
       
       double weight_kgs = weight_pds/2.2;
       
       System.out.println("The weight of the person in pound is "+weight_pds+" and in kg is "+weight_kgs);
	   }
	}