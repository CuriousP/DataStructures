import java.util.Stack;

// Non recursive in-order traversal using Stack

class Node{
	int data;
	Node left, right;
	
	public Node(int item){
		data = item;
		left = right = null;
	}
}

// class to print in-order traversal with stack
public class NonRecursiveTraversal {
	Node root;
	
	void inorder(){
		if(root == null){
			return;
		}
		
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		
		while(node != null){
			stack.push(node);
			node = node.left;
		}
		
		while(stack.size()> 0){
			node = stack.pop();
			System.out.println(node.data + " ");
			if(node.right != null){
				node = node.right;
			
			while(node != null){
				stack.push(node);
				node = node.left;
				
			}
			
		}
	}
		
}
	
	public static void main(String args[]){
		NonRecursiveTraversal tree = new NonRecursiveTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right = new Node(3);	
		tree.inorder();
	}

}
