import java.util.Scanner;

class RoundAround{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter length of 1st side ");
        int s1 = input.nextInt();
        System.out.printf("Enter length of 2nd side ");
        int s2 = input.nextInt();
        System.out.printf("Enter length of 3rd side ");
        int s3 = input.nextInt();

        int finalDistanceMetres = 5*1000; 

        int perimeter = s1 + s2 +s3; 
       
        int rounds = perimeter/finalDistanceMetres; 
        if (rounds*perimeter<5000) 
			rounds= rounds+1;
        
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km.");
		}
	}
