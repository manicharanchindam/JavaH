
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int i = sc.nextInt();
        if(i%4==0){
            System.out.println("this is a leap year");

        }
        else 
        {
            System.out.println("this is not a leap year");
        }
    }
    
}
