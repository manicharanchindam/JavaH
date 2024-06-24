import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int id=sc.nextInt();
        int fact =1;
        for(int i=1;i<=id;i++){
            fact=fact*i;

        }
        System.out.println("Factorial of " +  id +" is "+fact);

    }
    
}
