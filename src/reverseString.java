import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            String para=sc.nextLine();
            System.out.println(reverse(para));
        }
        
    }
    public static String reverse(String para){
        String [] words=para.split(" ");
        int len= words.length;
        String reversed=" ";
        for(int j=len-1;j>=0;j--){
            reversed =reversed+words[j];
            if(j!=0){
                reversed=reversed+" ";
            }
        }
        return reversed;

    }
    
}
