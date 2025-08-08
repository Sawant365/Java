package USS;
import java.util.*;
	

public class Map_example {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"piya");
		m.put(2, "sanika");
		m.put(3, "tejal");
		System.out.println(m);
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			//map entry is store the key and value to separate
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			 
		}
		//elements can traverse in any order
		for(Map.Entry i:m.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
			
		}
		
		// TODO Auto-generated method stub

	}
}


