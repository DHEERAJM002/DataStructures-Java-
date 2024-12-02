package DataStructures;

import java.util.Scanner;
class Queue{
	private int queue[];
	private int front,rear;
	public Queue() {
		// TODO Auto-generated constructor stub
		queue=new int[10];//max size is 10
		front=0;
		rear=-1;
	}
	public Boolean ifFull() {
		if(rear==9)
			return true;
		else 
			return false;
	}
	public Boolean ifEmpty() {
		if(front>rear)
			return true;
		else 
			return false;
	}
	public void insert(int n) {
		if(!ifFull()) {
			queue[++rear]=n;
			if(front==-1)
				front=0;
		}
		else
			System.out.println("Queue is full");
	}
	public void remove() {
		if(!ifEmpty())
			System.out.println(queue[front++]+" has been removed");
		else
			System.out.println("Queue is empty");
		
	}
	public void display() {
		if(ifEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i]+" ");
		System.out.println();
	}
}
public class QueueUsingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		while(true) {
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.Display");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:if(q.ifFull()) 
						System.out.println("Queue is full.");
			else {
				System.out.println("Enter the element:");
			  		q.insert(sc.nextInt());
			}
				break;
			case 2:q.remove();
				break;
			case 3:q.display();
				break;
			default:System.out.println("You have exited the menu");
				System.exit(0);
				break;
			}
		}
	}
}
