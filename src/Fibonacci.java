
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=1;
        int n2=1;
        int n3=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            for(int j=0;j<a;j++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            }
        }
        System.out.println(n3);
    }
    
}
