import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
