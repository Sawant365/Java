package Basic_code;

import java.util.Arrays;

public class Anagram_pgm {

	public static void main(String[] args) {
		String s1="Priya";
		String s2="ayirp";
		
		
		if(isAnagram(s1,s2)) {
			System.out.println("it is an Anagram");
			
		}
		else {
			System.out.println("it is not anagram");
			
		}
	
	}
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
			
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1,ch2);
		
	}
	
}
