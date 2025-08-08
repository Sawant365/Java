package USS;

public class Two {

	public static void main(String[] args) {
		
		Ianimal one=( int  j, int k)-> System.out.println(j+k);


		
	one.run(100,1000);
	//one.sleep();
	}

}

@FunctionalInterface
interface Ianimal
{
	public void run(int i,int j);
	
	//public void sleep();
}

