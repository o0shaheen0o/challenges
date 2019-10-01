import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeMap;

public class DataStracture {

	public static void main(String[] args) throws IOException {

		
		int [] num =  {1,2,3,4,5};
	
		Hashtable<String, int []> hashTable = new Hashtable<String, int[]>();
//*null*/hashTable.put(null, null); // hashTable does not allow null to the keys nor to the value
		hashTable.put("mohamed", num);
		for(int y: hashTable.get("mohamed"))
		System.out.println("hashTable "  + y);
		
		HashMap<String , int []> hashMap = new HashMap<String ,int[]>();
/*null*/hashMap.put(null, null);//hashMap allow null values to the key and the value
		hashMap.put("mohamed", num);
	
		for(int x: hashMap.get("mohamed"))
		System.out.println("hashMap " +  x);
		
		
		
		TreeMap<String,int[]> s = new TreeMap<String,int[]>();
		
		Arrays.asList(s.values());
		
		
		RandomAccessFile raf = new RandomAccessFile("textFile.txt", "rw");
	//	raf.writeChars("hellow from random access file ");
		System.out.println(raf.readLine());
		
		java.util.Set<int[]> set = new HashSet<int[]> ();
		
		
		Object[] stringA = set.toArray();
		
		LinkedList<Object> linkedList = new LinkedList<>(Arrays.asList(stringA));
		
		
		int [] a = {1,2,3,4};
		int [] b = {1,2,3,4};
		set.add(a);
		set.add(b); 
		
		for (int [] x: set) {
			for (int y: x)
			System.out.println(y);
		}
	

		
	}

}
