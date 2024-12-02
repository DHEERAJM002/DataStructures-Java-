package DataStructures;

import java.util.Scanner;
class Stack{
	private char stack[];
	private int top;
	public Stack() {
		// TODO Auto-generated constructor stub
		stack=new char[10];//Maximum stack size is 10
		top=-1;
	}
	public Boolean ifFull() {
		if(top==9)
			return true;
		else 
			return false;
	}
	public Boolean ifEmpty() {
		if(top==-1)
			return true;
		else 
			return false;
	}
	public void push(char n) {
		if(!ifFull())
			stack[++top]=n;
		else
			System.out.println("Stack is full");
	}
	public void pop() {
		if(!ifEmpty())
			System.out.println(stack[top--]+" popped from the stack.");
		else
			System.out.println("Stack is empty");
	}
	public void peek() {
		if(!ifEmpty())
			System.out.println(stack[top]);
		else 
			System.out.println("Stack is empty");
	}
	public void display() {
		if(!ifEmpty()) {
			for(int i=0;i<=top;i++)
				System.out.print(stack[i]+" ");
			System.out.println();
		}
		else 
			System.out.println("Stack is empty");
	}
}
public class StacksUsingArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		while(true) {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:if(st.ifFull()) 
						System.out.println("Stack is full.");
			else {
				System.out.println("Enter the element:");
				sc.nextLine();
					String s=sc.nextLine();
			  		st.push(s.charAt(0));
			}
				break;
			case 2:st.pop();
				break;
			case 3:st.peek();
				break;
			case 4:st.display();
				break;
			default:System.out.println("You have exited the menu");
				System.exit(0);
				break;
			}
		}
	}
}
