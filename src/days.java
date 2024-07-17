
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the day");
        int day=sc.nextInt();
        String Name;
        switch (day){
            case 1:
            Name="Monday";
            break;
            case 2:
            Name="Tuesday";
            break;
            case 3:
            Name="Wednesday";
            break;
            case 4:
            Name="Thursday";
            break;
            case 5:
            Name="Friday";
            break;
            case 6:
            Name="Saturday";
            break;
            case 7:
            Name="Sunday";
            break;
            default:
            Name="Invalid";
            break;
        }
        System.out.println("the day is: "+Name);
        sc.close();

    }
    
}
