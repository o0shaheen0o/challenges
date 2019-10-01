import java.util.Arrays;

public class Anagram {

	public static void main (String args[]) {
		callAll("54321","12345");

	}
	
	public static void callAll(String s,String t) {
		System.out.println("will be true if the strings are anagram ="+anagram(s, t));
		// very complicated logic from the "crack the code" 
		
		System.out.println("will be true if the strings are anagram ="+ sortAnagram(s, t));
		// sort the char of the string and compare hashcode " .. true if the string have the same characters
		
		System.out.println("will be true only if the strings are identical ="+ identicalString(s, t));
		// use hashcode without sorting "will be true only if the string is identical"
		
		
	}
// SOLUTION #1	
	public static boolean anagram(String s, String t) {
	
		if (s.length() != t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			if (letters[c] == 0)
				++num_unique_chars;
			++letters[c];
		}
		for (int i = 0; i < t.length(); ++i) {
			int c = (int) t.charAt(i);
			if (letters[c] == 0) { // Found more of char c in t than in s.
				return false;
			}
			--letters[c];
			if (letters[c] == 0) {
				++num_completed_t;
				if (num_completed_t == num_unique_chars) {
					// it’s a match if t has been processed completely
					return i == t.length() - 1;
				}
			}
		}
		return false;
	}
	
//SOLUTION #2	
	public static boolean identicalString(String s , String t) {
		
		return s.hashCode()==t.hashCode();
	}
	public static boolean sortAnagram(String s, String t) {
		char[]sArray = s.toCharArray();
		char[]tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		s= new String(sArray);
		t = new String (tArray);
		return s.hashCode()==t.hashCode();
		
	}
}
