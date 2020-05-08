import java.io.*;
public class StackUsingList {
	private class StackNode{
		private int data;
		private StackNode next;
		private StackNode(int data) {
			this.data = data;
		}
	}
	private StackNode top;
	public boolean isEmpty() {
		return top == null;
	}
	public void push(int data) {
		StackNode node = new StackNode(data);
		if (top == null)
			top = node;
		else {
			node.next = top;
			top = node;
		}
	}
	public int peek() {
		if (top != null) {
			return top.data;
		}
		else
			return -1;
	}
	public int pop() {
		if (top != null) {
			int element = top.data;
			top = top.next;
			return element;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stack using Linked List");
		StackUsingList obj = new StackUsingList();
		obj.push(10);
		obj.push(15);
		obj.push(23);
		System.out.println("Top of stack is "+obj.peek());
	}

}
