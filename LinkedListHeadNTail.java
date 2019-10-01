
public class LinkedListHeadNTail {
	public Node head;
	public Node tail;
	
	public static void main(String[] args) {
		LinkedListHeadNTail LinkedList = new LinkedListHeadNTail();
		LinkedList.insertNode(1);
		LinkedList.insertNode(2);
		LinkedList.insertNode(3);
		
		LinkedList.prnitHeadToTail();	
		LinkedList.printTailToHead();
	}
	
	public  void insertNode(int data) {
		Node newNode = new Node();
		newNode.data=data;
		
		if(tail==null) {
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;			
		}		
	}
	
	public void prnitHeadToTail() {
		while (head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public void printTailToHead() {
		while(tail!=null) {
			System.out.println(tail.data);
			tail=tail.previous;
		}
	}
}
class Node {
	public Node next ;
	public Node previous;
	public int data;
}

