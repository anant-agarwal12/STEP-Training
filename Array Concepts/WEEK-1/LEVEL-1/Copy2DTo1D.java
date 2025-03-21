import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols]; 
        int index = 0;
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Print the 1D array
        System.out.print("1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
