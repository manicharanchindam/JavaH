import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite");
        } else {
            System.out.print("Prime factors are: ");
            printPrimeFactors(n);
        }
    }
    
    public static void printPrimeFactors(int number) {
        // Check for the number of 2s that divide the number
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // number must be odd at this point, so a skip of 2 (i = i + 2) can be used
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, print i and divide number
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // This condition is to handle the case when number is a prime number
        // greater than 2
        if (number > 2) {
            System.out.print(number);
        }
    }
}
