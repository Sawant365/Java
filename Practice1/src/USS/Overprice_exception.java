package USS;

//Custom Exception Class
class Overprice_exception extends Exception{
 public Overprice_exception() {
     super();
     System.out.println("Instance created");
}
 
public class User {
	int amount;

	public void checkPrice(int i) {
	}
}
 public static void main(String[] args) {
     User u = new User();
     u.checkPrice(600);
 }

 public void checkPrice(int amount) {
     try {
         if (amount > 500) {
             throw new Overprice_exception();  // Throw custom exception
         } else {
             System.out.println("Go ahead");
         }
     } catch (Overprice_exception e) {
         System.out.println(e.getMessage());  // Print custom exception message
     }
 }
}
	
	
