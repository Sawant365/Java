package Basic_code;

public class Aramstron_pgm {

	public static void main(String[] args) {
		int number=145;
		int original=number;
		int rem;
		int  result=0;
		
		while(original!=0) {
			rem=original%10;
			result+=Math.pow(rem, 3);
//		/result=Math.pow( original, result);
		original/=10;
			
		}
		if(result==number) {
			System.out.println("is a Aramstrong");
		}
		else {
			System.out.println("ia a not Aramstrong");
		}
	}

}
