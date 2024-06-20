import java.util.Scanner;

public class nested {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if (a>=b) 
        {
            if(a>=c)
            {
                System.out.println("First number is grater");
            }
            else
            {
                System.out.println("second number is grater");
            }
        }
        else
        {
            if(c>=a)
            {
                if(c>=b)
                {
                System.out.println("Third number is grater");
                }
                else{
                    System.out.println("second number is grater");
                }
            }
            else
            {
                System.out.println("second number is grater");

            }


        }
     }
}
