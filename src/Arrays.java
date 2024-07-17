import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
   int [] id= new int[5];
   int sum=0;
    Scanner sc = new Scanner (System.in);
    for(int i=0;i<5;i++){
        System.out.println("Enter the marks of subject "+(i+1));
        id[i]=sc.nextInt();
        if(id[i]>100){
            System.out.println("Enter a valid marks");
            i--;
        }
        
    }
    if(id[0]<40){
        System.out.println("you are failed in subject 1 "+id[0]);
    }
    if(id[1]<40){
        System.out.println("you are failed in subject 2 "+id[1]);
    }
    if(id[2]<40){
        System.out.println("you are failed in subject 3 "+id[2]);
    }
    if(id[3]<40){
        System.out.println("you are failed in subject 4 "    +id[3]);
    }
    if(id[4]<40){
        System.out.println("you are failed in subject 5 "    +id[4]);
    }
    // for(int i=0;i<5;i++){
    //     System.out.println("the marks of subject "+(i+1)+" is "+ id[i]);
    // }
    for(int i=0;i<5;i++){
        sum+=id[i];
    }
    double avg=sum/5;
    long avgR=Math.round(avg);
    System.out.println("The total marks are "+sum);
    System.out.println("The avg of all subjects are "+avgR);
   
    sc.close();
}
}
