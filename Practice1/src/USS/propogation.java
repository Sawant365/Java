package USS;

public class propogation {
		public void checkage(int age)
		{
			
			if(age>18) {
				System.out.println("you can eligible");
			}
			else {
				System.out.println("not eligible");
			}
		}

	public static void main(String[] args) {
		propogation  v=new propogation();
		v.checkage(20);
	}
	}


