package USS;

import java.util.Set;
import java.util.TreeSet;

public class Camparator_demo {

	public static void main(String[] args) {
		Set<Film> Book=new TreeSet();
		
		Film f1= new Film(1,"ved",10.0,250);
		Film f2= new Film(2,"kakan",9.0,300);
		Film f3= new Film(3,"Prem",9.5,200);
		
		Book.add(f1);
		Book.add(f2);
		Book.add(f3);
		for(Film m:Book)
		{
			
			System.out.println("ratings :"+m.name);
			System.out.println(m.Price);
			System.out.println(m.id);
		}

	}

}
class Film implements Comparable<Film>{
	int id;
	String name;
	double Ratings;
	int Price;
	
	public Film(int id,String name,double Ratings, int Price )
	{
		this.id=id;
		this.name=name;
		this.Ratings=Ratings;
		this.Price=Price;
	}

	@Override
	public int compareTo(Film o) {
		
		return this.id-o.id;
	}
	
}
