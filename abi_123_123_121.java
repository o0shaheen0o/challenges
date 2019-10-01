/*
 * AMAZON interview question
 */


import java.util.*;
public class abi_123_123_121 {



	    public static void main(String[]args)
	    {

	        List<String > s = new ArrayList<>();
	        s.add("abi 123 123 121");
	        s.add("abc ab1 sa1 ");
	        s.add("abd 1n2 bc1 nb2");
	        s.add("abe 123 123 121");
	        s.add("bcg 1n2 bc1 nb2");
	        s.add("abf ab1 sa1 ");


	        new abi_123_123_121().orderedJunctionBoxes(6,s);

	    }

	        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	        public List<String> orderedJunctionBoxes(int numberOfBoxes,
	                                                 List<String> boxList)
	        {

	            Map <String,String> map = new TreeMap<>();
	            List<String>results = new ArrayList<>(numberOfBoxes);
	            for(String s :boxList)
	            {
	                String arrS[] = s.split(" ");
	                if(!arrS[1].matches("[0-9]*"))
	                {
	                    map.put(arrS[0],s);
	                }
	                else
	                {
	                    results.add(s);
	                }
	            }
	            Set<String> keys = new LinkedHashSet<>();
	            keys=map.keySet();
	            boxList.clear();

	            for (String s: keys)
	            {
	                boxList.add(map.get(s));
	            }
	            for(String s :results)
	            {
	                boxList.add(s);
	            }
	            return  boxList;
	        }
	        // METHOD SIGNATURE ENDS
	    }
