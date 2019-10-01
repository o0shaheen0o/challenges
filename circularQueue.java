import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class circularQueue {
	
	private int head ;
	private int tail ;
	String [] list ;
	public circularQueue(int size)
	{
		head=1;
		tail=1;
		list=new String[size];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularQueue CirQueue = new circularQueue(5);
	

		for (int i = 0; i <=5;i++)// queue length is 5
		{
			CirQueue.add(Integer.toString(i));
		}
	
		
	}


	public  void add(String s) {
		if(head == tail|| tail%5!=head) 
		{
			this.list[tail%5]=s;
			System.out.print(s + " ");
			tail++;
		}
		else if ((tail)%5==head )
		{
			System.out.println("queue is full ");
		}
	}

}
