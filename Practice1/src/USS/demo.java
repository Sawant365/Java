package USS;

public class demo {
    public static void main(String[] args) {
        try {
        	user u = new user();
            System.out.println("User object created successfully.");
        } catch (Error e) {
            System.out.println("Alt: Print Error");
        }
    }
    public static class user {
   
    }
}