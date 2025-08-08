package USS;
	import java.util.ArrayList;

	public class Array_first{
	    public static void main(String[] args) {
	        // Creating and populating ArrayList with integers
	        ArrayList<Integer> num = new ArrayList<>();
	        for (int i = 0; i < 15000; i++) {
	            num.add(i);
	        }

	        // Measuring time to remove element at index 30
	        long start = System.nanoTime();
	        int removed_num = num.remove(30);
	        long end = System.nanoTime();

	        System.out.println("Removed number: " + removed_num);
	        System.out.println("Computation time (ns): " + (end - start));

	        //
	        ArrayList<Intern> internsList = new ArrayList<>();
	        for (int i = 0; i < 150; i++) {
	            internsList.add(new Intern(i, "Name" + i, 1234567890L + i, 15000 + i * 1000, 20 + i));
	        }

	        // Display intern details
	        for (Intern intern : internsList) {
	            System.out.println(intern.display());
	        }
	    }
	}

	// Separate Intern class 
	class Intern {
	    int id;
	    String name;
	    long mobile;
	    long salary;
	    int age;

	    public Intern(int id, String name, long mobile, long salary, int age) {
	        this.id = id;
	        this.name = name;
	        this.mobile = mobile;
	        this.salary = salary;
	        this.age = age;
	    }

	    public String display() {
	        return "ID: " + id + ", Name: " + name + ", Mobile: " + mobile +
	               ", Salary: " + salary + ", Age: " + age;
	    }
	}

