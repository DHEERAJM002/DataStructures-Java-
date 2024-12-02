package DataStructures;

import java.util.Scanner;

class Node{
	private int data;
	private Node next;
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.next=null;
	}
	public Node(int data,Node next) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.next=next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
class SinglyLinkedList{
	private Node first;
	public Boolean ifEmpty() {
		if(first==null)
			return true;
		return false;
	}
	public void addFront(int n) {
		Node node=new Node(n);
		node.setNext(first);
		this.first=node;
	}
	public void removeFront() {
		if(ifEmpty()) {
			System.out.println("The list is Empty.");
			return;
		}
		System.out.println(first.getData()+" has been removed.");
		first=first.getNext();
	}
	public void addRear(int n) {
		if(ifEmpty()) {
			System.out.println("The list is Empty.");
			return;
		}
		Node node=new Node(n);
		Node temp=first;
		while(temp.getNext()!=null)
			temp=temp.getNext();
		temp.setNext(node);
	}
	public void removeRear() {
		if(ifEmpty()) {
			System.out.println("The list is Empty.");
			return;
		}
		Node prev=null;
		Node temp=first;
		while(temp.getNext()!=null) {
			prev=temp;
			temp=temp.getNext();
		}
		System.out.println(temp.getData()+" has been removed.");
		prev.setNext(null);
	}
	public void display() {
		Node temp=first;
		if(ifEmpty()) {
			System.out.println("The list is Empty.");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
public class LinkedLists {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		while(true) {
			System.out.println("1.Add Front");
			System.out.println("2.Add Rear");
			System.out.println("3.Remove Front");
			System.out.println("4.Remove Rear");
			System.out.println("5.Display");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the number:");
				int n=sc.nextInt();
				list.addFront(n);
				break;
			case 2: System.out.println("Enter the number:");
				int n1=sc.nextInt();
				list.addRear(n1);
				break;
			case 3:list.removeFront();
				break;
			case 4:list.removeRear();
				break;
			case 5:list.display();
				break;
			default:System.exit(0);
				break;
			}
		}
	}
}
