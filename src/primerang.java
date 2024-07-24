
import java.util.Scanner;

public class primerang {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                return false;
            }

        }
        return true;
    }
    
}
