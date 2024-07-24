import java.util.* ;
class baseandexponent {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++){
			a=a*x;
		}
		System.out.println(a);
		
	}
}