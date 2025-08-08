package USS;

import java.util.ArrayList;

public class Array_pgm {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		for(int i=0; i<1500;i++)
		{
			num.add(i);
			}
	long start=System.nanoTime();
	int removed_num= num.remove(30);
	System.out.println("removed num+:num");
	long end=System.nanoTime();
	System.out.println("compution time:"+((end-start)/100));
	
	}

}
