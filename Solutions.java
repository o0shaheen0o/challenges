import java.util.HashSet;
import java.util.Set;

public class Solutions {
	
	
	public static void main (String [] args) {
		Solutions s = new Solutions();
		int A [] = new int[300];
		for (int i =0; i<=100;i++)
			A[i]=i;
		for (int i=102;i<=200;i++)
			A[i]=i;
		System.out.println(s.solution(A));
	}
	/*
	 * 100% correct but takes o(n^2) bad performance
	 */
	   public int sol(int [] A) {
		    int solution = 1;
		    
		     for (int i=0;i<A.length; i++){
		        	for(int h=0;h<A.length;h++)
		        	if (solution==A[h]) {
		        		solution+=1;
		        	}
		        }
		        
				return solution;
	   }
	
	/*
	 * NOT CORRECT ALL THE TIME 
	 * BUT HAVE LOGIC THAT WORTH LOOK INTO
	 */
	   public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        int max = -1;
	        int solution=1;
	        int min = 1;
	        Set set = new HashSet();
	        boolean series= false;
	        for (int i=0; i<A.length;i++)//get min and max
	        {
	        	set.add(A[i]);
	            if (max<A[i]){
	                max= A[i];                
	            }            
	         	   if (min>=A[i]&& A[i]>0) {
	            	
	            	min= A[i];
	            }
	        }// end of loop
	   
	        if (min+set.size()==max+1){
	        	System.out.println(min + " "+ set.size()+ " " + max+1);
	        	
	    		return max+1;
	    	}
	        for (int i=0;i<A.length; i++){
	        	for(int h=0;h<A.length;h++)
	        	if (solution==A[h]) {
	        		solution+=1;
	        	}
	        }
	        
			return solution;
	    }
	
}