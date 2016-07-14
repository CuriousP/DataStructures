package linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(4);
		n.appendToTail(1);
		n.appendToTail(3);
		n.appendToTail(2);
		n.appendToTail(8);
		
		Node current = n;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		
		Node f = NthFromLast.nthFromLast(n, 4);
		if(f != null){
		System.out.println("4th from last node is: " + f.data);	
		}
		else{
			System.out.println("Return value is null");
		}
	}

}
