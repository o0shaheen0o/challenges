import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class String_manipulation {
	public static void main (String []args) {
		
		int c = 'c';
		String intToBinary = Integer.toBinaryString(c);
		System.out.println(intToBinary);
/*		
		
		int intNum = 15;
		//   int --> String
		String string = String.valueOf(intNum);
		
		//returns only one char ..if 2 digits passed wont work
		// int --> char
		char ch = Character.forDigit(intNum, 10);	

		// int --> Integer
		Integer integer = Integer.valueOf(intNum);
		// String --> int 
		intNum = Integer.parseInt(string);
		// char --> int
		intNum = Character.getNumericValue(ch);// one digit only  char
		
		// int --> char[]
		char[] charArray = String.valueOf(intNum).toCharArray();
		intNum = Integer.parseInt(new String (charArray));
		String s = new String(charArray);
		charArray= s.toCharArray();
		
		int num = new Integer(ch);
		
		System.out.println(intNum);*/

		
		
		
	/*
	 * multiply this together adn add the value to a different int[] 
	 */ 
		
		Integer [] x={3,4,5,2};
		
		Object [] intA = x;
		
		List l = Arrays.asList(intA);
		String stringL = l.toString();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(stringL,"[], ");
		
		while (st.hasMoreTokens())
		{
			
			sb = sb.append(st.nextToken());
		}
		
		Integer intS = Integer.valueOf(sb.toString())+1;
		char[] arrayInt = intS.toString().toCharArray();
		l= Arrays.asList(arrayInt);
		intA =  l.toArray();
		int  ind =0;
		
		System.out.println(intA);
		
		
		//get the value of the int [] charA as an int
		//
		// get the value of the char []charb as ab in value
		//Multiply the 2 numbers together 
		// get the size of the reults and create and array to fit the results 
		
		
		
	
		
		double pow = Math.pow(2, 2)+ Math.pow(4, 2);
		Math.sqrt(pow);
		
		
		
	}

}
