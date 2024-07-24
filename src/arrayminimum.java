import java.util.Arrays;
import java.util.Scanner ;
public class arrayminimum {
    // public static int minimumSum(int[] arr1, int[] arr2, int n) {
        
    // }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of sets required");
        int n=sc.nextInt();
        System.out.println("Enter array size"); 
        for(int i=0;i<n;i++){
        int a=sc.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[a];
System.out.println("Enter the 1st array ");
        for(int j=0;j<a;j++){
            arr1[j]=sc.nextInt();

        }
        System.out.println("Enter the 2nd array ");

        for(int j=0;j<a;j++){
            arr2[j]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         int temp=0;
        if(arr1[i]<arr2[i]){
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        System.out.println(Arrays.toString(arr1) );
        System.out.println(Arrays.toString(arr2) );

        int sum=0;
    for(int k=0;k<a;k++){
        sum=sum+(arr1[i]-arr2[i]);
    }
    System.out.println(sum);


        
        }
        


    }
}
