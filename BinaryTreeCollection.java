import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import trainings.BinTree;
import trainings.BinaryTree;

public class BinaryTreeCollection {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(31);
		arrayList.add(11);
		arrayList.add(26);
		arrayList.add(33);
		arrayList.add(8);
		arrayList.add(6);
		TreeSet<Integer> arrayToTree = new TreeSet<>(arrayList);	
		System.out.println(arrayToTree);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(25);
		treeSet.add(32);
		treeSet.add(7);
		treeSet.add(5);
	
		System.out.println(treeSet);	
		treeSet.remove(32);
		
		BinaryTree binTree = new BinaryTree();
	//  binTree.addNode(key, name);
		binTree.addNode(1,"mohamed");
		binTree.addNode(0, "hassan");
		binTree.addNode(2, "hoda");
		binTree.addNode(3, "mona");
		
		System.out.println(binTree);
		
		Integer i= 5;
		Integer x=10;
		
		System.out.println(i.compareTo(x));
		
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
		cachedThreadPool.submit(new Thread() {
		});
		cachedThreadPool.shutdown();
		
	}

}
