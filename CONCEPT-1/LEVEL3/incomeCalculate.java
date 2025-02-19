import java.util.Scanner;

class IncomeCalculate{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter salary: ");
    
    int salary  = input.nextInt();
    System.out.print("Enter bonus: ");
    
    int bonus  = input.nextInt();

    int income = bonus + salary;   

    System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " Hence Total Income is INR " + income);
	}
}