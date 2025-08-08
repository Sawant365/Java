package USS;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setone {

	public static void main(String[] args) {
		
		Set<Movie> Book=new TreeSet(new pricesort());
		
		
//		
		
		Movie first=new Movie(1,"KabirSingh",10.0,100);
		
		Movie second=new Movie(2,"ArjunReddy",9.0,76);
		
		Book.add(second);
		Book.add(first);
		for(Movie m:Book)
		{
			
			System.out.println("ratings :"+m.name);
			System.out.println(m.Price);
			System.out.println(m.id);
		}
		
		
		
//		Student student_one=new Student(1,"Aasdf","A@");
//		Student student_two=new Student(3,"Bggthtjj","B@");
//		Student student_three=new Student(2,"Crty6uiii","C@");
//		
//		numbers.add(student_one);
//		numbers.add(student_two);
//		numbers.add(student_three);
//		//numbers.add(7);
//		
//		for(Student i:numbers)
//		{
//			System.out.println(i.name);
//		}
//		
		

	}

}

class Student implements Comparable<Student>
{
	int id;
	String name;
	String email;
	
	public Student(int id, String name,String email)
	{
		this.name=name;
		this.id=id;
		this.email=email;
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
	 return o.name.length()-this.name.length();
	}
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//	 return o.name.length()-this.name.length();
//	}
}







class Movie implements Comparable<Movie>
{
	int id;
	String name;
	double ratings;
	int Price;
	
	
	public Movie(int id, String name,double ratings,int Price)
	{
		this.id=id;
		this.name=name;
		this.ratings=ratings;
		this.Price=Price;
	}


	@Override
	public int compareTo(Movie o) {
	 
				if(this.ratings < o.ratings)
				{
					return 1;
				}
				else if(this.ratings> o.ratings)
				{
					
					return -1;
					
				}
				return 0;
	}
}

class ratingsort implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.ratings > o2.ratings)
		{
			return 1;
		}
		else if(o1.ratings< o2.ratings)
		{
			
			return -1;
			
		}
		return 0;
	}
	
}

class pricesort implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.Price > o2.Price)
		{
			return 1;
		}
		else if(o1.Price< o2.Price)
		{
			
			return -1;
			
		}
		return 0;
	}
	
}

