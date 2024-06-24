import java.util.Scanner;
public class nestedloop{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name :");
        String name =sc.nextLine();
        int len=name.length();
        for( int i=0;i<=len;i++){
            for( int j=0;j<i;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}