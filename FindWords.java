import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
	public static void main (String [] args)
	{
	    String s = "letcodefoofao";
	    List<String> dict = new ArrayList<String>();
	    dict= Arrays.asList("let","hhh","foo","code","fao");

	    for(String w : dict)
	    {
	        if (s.contains(w))
	        {
	            int n = w.length();
	            int startIndex =s.indexOf(w);
	            int endIndex =startIndex+n;
	            System.out.println("startIndex " + startIndex  + " endIndex "  +endIndex + " " + s.substring(startIndex,endIndex));
	        }

	    }
	}

}
