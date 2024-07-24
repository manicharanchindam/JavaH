import java.util.Scanner;
public class Fibonacciloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        
        
        int i;
        int j;
        int n3;
        System.out.println("0");
        for(i=1;i<=num;i++){
            int n1=0;
            int n2=1;
            System.out.print(n1+" "+n2);
            for(j=2;j<=i;j++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            }
        System.out.println();}
        sc.close();

    }
    
}

