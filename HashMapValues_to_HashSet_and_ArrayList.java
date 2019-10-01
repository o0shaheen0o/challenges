import java.util.*;

public class HashMapValues_to_HashSet_and_ArrayList {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		Collection<Integer> collection = 
				hashMap.values();//return the values of the HashMap in a Collection object
		
		Set h_set= hashMap.keySet();// return the keys of the hashMap in a set
		
		hashMap.put(1, 1);
	
		hashMap.put(1, 1);
		hashMap.put(1, 1);
		
		hashMap.put(2, 1);
		hashMap.put(2, 1);
		
		hashMap.put(3, 2);
		hashMap.put(4, 2);
		
		hashMap.put(5, 3);
		hashMap.put(5, 3);
		
		hashMap.put(6, 4);
		hashMap.put(6, 4);
		
		
		
		
		Set<Integer> hashSet = new HashSet<Integer>(collection);
		List <Integer> arrayList = new ArrayList<Integer>(collection);
		System.out.println("HashSet "+hashSet );
		System.out.println("ArrayList " +arrayList );
		System.out.println("keySet " + h_set );
		
		HashSet<Character> newSet = new HashSet<Character>();
		char [] array={'m','o','h','a','m','e','d'};
		for (char c : array) {
			newSet.add(c);
		}
		System.out.println(newSet);
	}

}
