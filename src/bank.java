import java.util.Scanner;

public class bank{
    static  int currentamount=10000;
    public static void greet(){
        System.out.println("Hello sir wellcome to my bank");
    }
    // public static void withdraw (){
    //     System.out.println("Cash has been withdrawed");

    // }
    // public void cash (){
    //     System.out.println("cash has been taken");
    // }
    public void withdraw( int a){
        currentamount =currentamount -a;
        if(a>currentamount){
            System.out.println("Insufficient Balance");
        }
        else{
        System.out.println("Amount withdrawed Successfully");
        }
    }
    public int  balanceamount( int a){
        System.out.println("Balance amount is: "+currentamount);
        return currentamount;
    }

    public static void main(String[] args) {
        greet();

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the amount to deposit");
        // int b=sc.nextInt();
        System.out.println("Enter the amount");
        int currentamount = sc.nextInt();
        bank id= new bank();
        // deposit(b);
       
        System.out.println("Enter the amount to withdraw");
        int a=sc.nextInt();
        id.withdraw(a);
       int totalbalance = id.balanceamount(a);
     sc.close();   
    }
}