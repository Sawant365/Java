package USS;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
	

	public static void main(String[] args) {
		Set<Students> s= new TreeSet();
		Students s1=new Students(1,"Tejal","msg");
		Students s2=new Students(3,"Priyanka","sms");
		Students s3=new Students(2,"Sanika","pns");
		Students s4=new Students(4,"Sakshi","ing");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		
	for(Students i:s) {
		System.out.println(i.name);
	}

	}

}
class Students implements Comparable<Students>{
	int id;
	String name;
	String Email;
	
	public Students(int id,String name, String Email) {
		this.id=id;
		this.name=name;
		this.Email=Email;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.name.length()-o.name.length();
	}
	
}
