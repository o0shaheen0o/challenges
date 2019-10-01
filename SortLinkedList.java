
public class SortLinkedList {
	Node tail ;
	Node head; 
	int size;
	public static void main(String[] args) {

		SortLinkedList ll= new SortLinkedList();
		/*		
		ll.insert(5);
		ll.insert(4);
		ll.insert(5);
		ll.insert(4);
		ll.insert(8);
		ll.insert(4);
		ll.insert(5);
		ll.insert(5);

		ll.sortList();
		ll.resetHeadNTail();

		ll.printTailToHead();
		System.out.println();	
		ll.printHeadToTail();	
		
*/
		ll.insert(5);
		ll.insert(4);
		ll.insert(5);
		ll.insert(4);
		ll.insert(8);
		ll.insert(4);
		ll.insert(5);
		ll.insert(5);
		
		ll.sortList1();
		ll.printTailToHead();
	}
	private void resetHeadNTail() {
		while (head.previous!=null ) {
			head= head.previous;
		}
		while(tail.next!=null) {
			tail=tail.next;
		}			
	}
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data=data;
		size++;
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
	
	public void printTailToHead() {
		while (tail!=null) {
			System.out.print(tail.data+ " :: ");
			tail=tail.previous;
		}
		
	}
	public void printHeadToTail(){
		while (head!=null) {
			System.out.print(head.data+ " :: ");
			head=head.next;
		}
	}
	public  void sortList() {
		int count=0;
		while ((tail!=null && head!=null)&& (size-count>0)) {
			if (tail.data<=4) {
				if(head.data>4) {
					int temp = head.data;
					head.data=tail.data;
					tail.data=temp;
					head=head.next;		
					tail=tail.previous;
					count+=2;
				}else {
					head=head.next;
					count++;
				}
			}else {
				tail=tail.previous;
				count++;
			}
		}
		System.out.println();
	}
	
	public void sortList1() {
		Node finished =tail;
		while (head!=null && head!=finished) {
			if (head.data<=4) {
				head=head.next;
			}else {
				
				Node temp = head;
				if (head.previous==null) {
					head=head.next;
					head.previous=null;
				}
				else 
				{
					head.next.previous=head.previous;
					head.previous.next=head.next;
					head=head.next;
					
				}
								
				tail.next=temp;
				temp.previous=tail;
				tail.next=temp;
				tail=tail.next;
		
				
			}
		}

}
	class Node1 {
		public int data;
		public Node previous;
		public Node next;
		
	}
}
