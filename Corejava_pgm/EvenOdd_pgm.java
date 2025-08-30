package Basic_code;

import java.util.Scanner;

public class EvenOdd_pgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("it is a Even number");
		}
		else {
			System.out.println("it is Odd number");
		}
		
		sc.close();

	}

}
