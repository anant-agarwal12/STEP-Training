
import java.util.Scanner;


class Travelling{
   
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("Enter your Name: ");
       
       String name = input.nextLine();
       
       
       String fromCity, viaCity, toCity;
       System.out.println("Enter your from City:");
       fromCity = input.nextLine();    
	   
       System.out.println("Enter your via City:");
       viaCity = input.nextLine();
       
       
	   System.out.println("Enter your To City:");
       toCity  = input.nextLine();

       
       System.out.println("Enter distance from city to via city:");
       double distanceFromToVia = input.nextDouble();
 
       
       System.out.println("Enter time taken from to via city in minutes:");
       int timeFromToVia = input.nextInt();

 
       
       System.out.println("Enter distance from via city to destination city:");
       double distanceViaToFinalCity = input.nextDouble();
 
      
       System.out.println("Enter time taken from to via city in minutes:");
       int timeViaToFinalCity = input.nextInt();
 
       
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
 
       
       int totalTime = timeFromToVia + timeViaToFinalCity;
 
 
       
       System.out.println("The Total Distance travelled by " + name + " from " + 
                          fromCity + " to " + toCity + " via " + viaCity +
                          " is " + totalDistance + " km and " +
                          "the Total Time taken is " + totalTime + " minutes");
    }
 }
