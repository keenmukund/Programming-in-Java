import java.util.Scanner;
import java.util.InputMismatchException;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class SingleLinkList{
	Node head ;
	public void insertLinkList(){
		System.out.println("Enter the element in the singlelinklist");
		Scanner sc = new Scanner(System.in);
		
		try{
			int data = sc.nextInt();
			if(head == null){
				head = new Node(data);
				System.out.println("Head data :"+head.data);
				return;
			}else{
				Node tempNode = head;
				while(tempNode.next != null){
					tempNode = tempNode.next;
				}
				Node newNode = new Node(data);
				tempNode.next = newNode;
				System.out.println("New data :"+newNode.data);
			}
		}catch(InputMismatchException e){
			System.out.println("Enter only Numbers!!");
		}
	}
	public void displayLinkList(){
		Node newNode = head;
		System.out.print("Data : ");
		while(newNode != null){
			System.out.print(" "+newNode.data);
			newNode = newNode.next;
		}
	}
	public void deleteElementLinkList(){
		int count = 0;
		boolean isDeleted = false;
		int position  = 1;
		System.out.println("Enter the element to be deleted :");
		Scanner sc = new Scanner(System.in);
		try{
				int element  = sc.nextInt();
				Node currNode = head;
				Node previousNode = head;
				while(currNode != null){
					if(currNode.data == element){
						previousNode.next = currNode.next; 
						isDeleted = true;
						break;
					}else{
						previousNode = currNode;
						currNode = currNode.next;
					}
				}
				if(!isDeleted){
					System.out.println("Element was not there in the linklist hence not deleted!!");
				}else{
					System.out.println("Element Deleted !");
				}
		}catch(InputMismatchException e){
			System.out.println("Enter only Numbers!!!");
		}
		
	}
	public void newHeadInsertionLinkList(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new head :");
		try{
			int data  = sc.nextInt();
			Node newHead = new Node(data);
			newHead.next = head;
			head = newHead;
			System.out.println("New Head inserted !");
		}catch(InputMismatchException e){
			System.out.println("Enter only numbers !!!");
		}
	}
	public void middleElementLinkList(){
		int count = 0;
		Node newNode = head;
		while(newNode != null){
			count++;
			newNode = newNode.next;
		}
		System.out.println("No. of elements in the linkedlist :"+count);
		newNode = head;
		if(count % 2 == 0){
			int mid1 = (count/2);
			int mid2 = (count/2) + 1;
			for(int i = 1;i <= mid2 ;i++){
				if((i == mid1)||(i == mid2)){
					System.out.println("Middle Element : "+newNode.data);
					newNode = newNode.next;
				}else{
					newNode = newNode.next;
				}
			}
		}else{
			int middle = (count / 2) + 1;
			for(int i = 1; i <= middle;i++){
				if(i == middle){
					System.out.println("Middle Element : "+newNode.data);
					newNode = newNode.next;
				}else{
					newNode = newNode.next;
				}
			}
		}
	}
	public static void main(String[] args){
		String str = "";
		Scanner sc = new Scanner(System.in);
		SingleLinkList s = new SingleLinkList();
		do{
			System.out.println("     **********MENU**********");
			System.out.println("1 - Insert the element at the end of Linklist \n2 - Display the elements of the LinkList \n3 - Delete the element from the LinkList \n4- Insert element at the beginning of the LinkList \n5- MiddleElement of the LinkList \n6- Exit");
			System.out.println("Please enter ur choice (1 - 6)");
			try{
				int input  = sc.nextInt();
				switch(input){
					case 1:
					s.insertLinkList();
					break;
					case 2:
					s.displayLinkList();
					break;
					case 3:
					s.deleteElementLinkList();
					break;
					case 4:
					s.newHeadInsertionLinkList();
					break;
					case 5:
					s.middleElementLinkList();
					break;
					case 6:
					return;
					default : System.out.println("Enter correct option ");
				}
			}catch(InputMismatchException e){
				System.out.println("Enter only numbersssss !!!");
			}
			System.out.println();
			System.out.println("Want 2 continueeee : (y / n)");
			str = sc.next();
			str = sc.next();
		}while(str.equals("y"));
	}
}