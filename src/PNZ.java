import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        if(i>0){
            System.out.println("The number is Positive");
        }
        else if(i<0){
            System.out.println("The number is negitive");
        }
        else{
            System.out.println("The Number is Zero ");
        }
    }
}
