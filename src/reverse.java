import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
           int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        System.out.println(rev);
        sc.close();

    }
    
}
