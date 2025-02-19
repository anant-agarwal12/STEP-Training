import java.util.Scanner;

class handshakes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter numnber of students:");
        
        int students = input.nextInt();
       
       
        int totalHandshakes = (students*(students-1))/2;
        
        System.out.println("The maximum number of possible handshakes possible between "+students+" students is "+totalHandshakes+" .");
    	}
	}
