
public class LinkList {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		ll.append(5);
		ll.append(10);
		ll.append(20);
		ll.show();

	}
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	public void append(int data) {
		Node node = new Node(data);
		if(head == null) {
			head=node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
				}
			n.next = node;
			}
	}
	public void insertAt(int index ,int data) {
		Node node = new Node(data);
		if(index == 0) {
			head = node;
			node.next = head;
			}
		else {
			Node n = head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public void deleteAt(int index) {
		if (this.isEmpty()) {
			return; 
		}
		else if(index==0) {
			head=head.next;
		}
		else {
			Node n = head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n.next = n.next.next;
		}
	}
	public void show() {
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}