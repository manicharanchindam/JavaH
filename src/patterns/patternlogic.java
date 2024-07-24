
import java.util.Scanner;

public class patternlogic {
    public static void main(String[] args) {
        // System.out.println("");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
