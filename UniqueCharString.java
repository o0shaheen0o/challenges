import java.util.HashSet;

public class UniqueCharString {

	   public static  void main(String []args)
	   {
	    //    new UniqueCharString().allCharUnique();
	        new UniqueCharString().allCharNoDataStructure();
	   }
	   public void allCharUnique()
	   {
	       String s = "abcdefghijklmno";
	       HashSet<Character> set = new HashSet<Character>();
	       for (char c :s.toCharArray())
	       {
	           set.add(c);
	       }
	           System.out.println(set.size()==s.length());


	   }
	   public void allCharNoDataStructure()
	   {
	       String s = "abcdefghijklmno";

	       for (char c : s.toCharArray())
	       {
	           if (s.lastIndexOf(c)==s.indexOf(c)) {

	           }
	           else{
	               System.out.println(s.lastIndexOf(c)==s.indexOf(c));
	           }


	       }
	   }
	   

}
