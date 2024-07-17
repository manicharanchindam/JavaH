import java.util.Scanner ;
class Solution {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int basic=sc.nextInt();
		char grade=sc.next().charAt(0);
		double hra=0;
		double da=0;
		double pf=0;
		int allow=0;
		double total=0;

		if(grade=='A')
        {
			  allow=1700;
		}
		else if(grade=='B'){
			 allow=1500;
		}
		else{
			  allow=1300;
		}
        hra=basic*0.20;
        da=basic*0.50;
		pf=basic*0.11;

        total= basic + hra + da + allow - pf;
        long roundedTotal = Math.round(total);

		System.out.println(roundedTotal);
	}
}