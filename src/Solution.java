import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int temp=N;
		while(temp!=0){
			int rem=temp%10;
		if(rem%2==0){
			sum1=sum1+rem;
		}
		else{
			sum2=sum2+rem;
		}
        temp/=10;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}