import java.util.* ;
class Quadrant {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter X value");
		int x=sc.nextInt();
		System.out.println("Enter Y value");
		int y=sc.nextInt();
		if(x>0 && y>0){
			System.out.println("1st Quadrant");
		}
		else if(x<0 && y>0){
			System.out.println("2nd Quadrant");

		}
		else if(x<0 && y<0){
			System.out.println("3rd Quadrant");

		}
		else if(x>0&&y<0){
			System.out.println("4th Quadrant");

		}
		else if(y==0 && x!=0){
			System.out.println("X axis");
		}
		else if(x==0 && y!=0){
			System.out.println("Y axis");
		}
		else {
			System.out.println("origin");
		}
		
		
	}
}