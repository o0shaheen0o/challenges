import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Try_Stuff {

	public static void main(String[] args) {
		w2d2h2h3h4();
		System.out.println();

		System.out.println(anagram1("abc","cba"));
		System.out.println(anagram2("abc","cba"));

		System.out.println();
		
		_20_Replace_String_ReplaceAll();
		System.out.println();

		System.out.println(isSubString("waterbottLe", "erbottLewat"));
		System.out.println();
		
		System.out.println(removeLinkedLDuplicate());
		
		
		FizzBuzz(20);
		
		List<Integer> l = new LinkedList<Integer>();
		int i=10;	
		while(i<=100) {
			l.add(i);
			i+=10;
		}
		System.out.println("N_to_last is "+ N_to_last_LinkedList(l,3));
		
		
	}
/**********************************************************************/	
	public static void w2d2h2h3h4 () {
/********************************************************************/		
		String string = "awerwsdfgdhhhhj";
		int [] a = new int [256];
		for (int i =0;i<string.length();i++	)
		{
			int  c = string.charAt(i);
			if (a[c]==0) {
				a[c]=1;
			}
			else {
				a[c]+=1;
				System.out.print(string.charAt(i)+""+ a[c] );
			}
		}
	}
	
/**********************************************************************/	
// FIRST WAY USEING SORTING AND equal();
 	public static boolean anagram1(String s1,String s2) {		
/*******************************************************************/		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (new String (c1).equals(new String(c2)))
			System.out.println(true);
		
		return true;
	}
 	
/**********************************************************************/	
//SECOND WAY USEING A FOR LOOP 
	public static boolean anagram2(String s1,String s2) {
/**********************************************************************/	

		for (int i=0,x=s2.length()-1;i<s1.length();i++,x--) {
			if (s1.length()!=s2.length()) {
				return false;
			}
			else if (s1.charAt(i)!=s2.charAt(x)) {
				return false;
			}
		}		
		return true;		
	}
/*******************************************************************/	
	public static void _20_Replace_String_ReplaceAll(){
/****************************************************************/		
		String s = "a   b c    ";
		int s_size= s.length()-1;
		while (s_size>=0 && s.charAt(s_size)==' ') {
			if (s.charAt(s_size)==' ') {
				s_size--;
			}					
		}
		s= s.substring(0, s_size+1);
		s= s.replaceAll(" ", "%20");
		System.out.println(s);		
	}
/*******************************************************************/	
	public static boolean isSubString(String s1,String s2) {
/*******************************************************************/	

		String s2_s2=s2+s2;
		if(s2_s2.contains(s1)) {
			return true;
		}
		return false;
		
	}
	
/*******************************************************************/	
	public static Set<String> removeLinkedLDuplicate () {
/*******************************************************************/	

		LinkedList<String> LL = new LinkedList<String>();
		LL.addFirst("1");
		LL.add("2");
		LL.add("3");
		LL.add("4");
		LL.addLast("2");
		
		Set<String> set = new HashSet<String>();
		set.addAll(LL);
		
		LL.addAll(set);
		return set;
		
		
	}
/*******************************************************************/	
	public static void FizzBuzz (int x){
/*******************************************************************/	

		int n=1;
		while(n<=x) {
			if(n==0)
				System.out.println(n);
			else if (n%3==0 && n%5==0)
				System.out.println("fizzBuzz");
			else if (n%3==0)
			System.out.println("fizz");
			else if (n%5==0)
				System.out.println("buzz");
			else
			System.out.println(n);
			n++;
			
		}
	}
/*******************************************************************/	
	public static Integer N_to_last_LinkedList(List<Integer> l,int n) {
/*******************************************************************/	

		int count =0;
		int posToLast =0;
		Integer N_to_last_node=0;
		
		Iterator<Integer> it = l.iterator();
		Iterator<Integer> itToLast=l.iterator();
		
		while (it.hasNext()) {
			
			while (count<n) {
				it.next();
				count++;
			}
			it.next();
			N_to_last_node=itToLast.next();		
			posToLast++;
		}
		return N_to_last_node;
	}
	

	public static boolean permutation2(String s1 , String s2)
	{
		HashMap<String,Integer> maps1 = new HashMap();
		HashMap<String,Integer> maps2 = new HashMap();
		for(int i =0; i <s1.length();i++)
		{
			if (maps1.containsKey(Character.toString(s1.charAt(i))))
			maps1.put(Character.toString(s1.charAt(i)),maps1.get(Character.toString(s1.charAt(i))+1));
			else
			maps1.put(Character.toString(s1.charAt(i)),1);

			if (maps2.containsKey(Character.toString(s2.charAt(i))))
			maps2.put(Character.toString(s2.charAt(i)),maps2.get(Character.toString(s2.charAt(i))+1));
			else
			maps1.put(Character.toString(s2.charAt(i)),1);
		}

		return true;
	}
	

	

}
