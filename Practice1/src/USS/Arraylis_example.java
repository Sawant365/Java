package USS;
import java.util.*;

public class Arraylis_example {
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(10);
		arr1.add(40);
		arr1.add(20);
		arr1.add(10);
		arr1.add(20);
		System.out.println(arr1);
		HashSet<Integer> s=new HashSet<>();
		s.addAll(arr1);
		System.out.println(s);
	
	}

}
 