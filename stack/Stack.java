package stack;

public class Stack {
	Node top;

	void push(int d) {
		Node t = new Node(d);
		t.next = top;
		top = t;
	}

	int pop(){
		if (top != null){
			int item = top.data;
			top = top.next;
			return item;
			}
		return -1;
	}

	int peek() {
		if(top == null){
			return -1;
		}
			return top.data;
	}
}// End of class
