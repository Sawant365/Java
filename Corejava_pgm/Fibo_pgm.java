package Basic_code;

public class Fibo_pgm {

	public static void main(String[] args) {
		int n=10,n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		}

}
