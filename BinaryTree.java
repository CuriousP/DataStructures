package Trees;

class Node{
	
	Node left, right;
	int data;	
	
	
	public Node(int d){
		data = d;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	
	public BinaryTree(){
		root = null;
	}

/* Printing nodes of Binary tree in Preorder */

public void printPreorder(Node root){
	if(root == null){
		return;
	}
	
	System.out.println(root.data + " ");
	printPreorder(root.left);
	printPreorder(root.right);		
	}

public void printInorder(Node node){
	if(node == null){
		return;
	}
	
	printInorder(node.left);
	printData(node);
	printInorder(node.right);		
	}

private void printData(Node n){
	System.out.println(n.data + " " + (n.left == null && n.right == null));
}

public void printPostorder(Node node){
	if(node == null){
		return;
	}
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.println(node.data + " ");
	}

void printPostorder()  {     
	printPostorder(root);  
	}

void printInorder(){
	printInorder(root);   
	}

void printPreorder(){
	printPreorder(root);  }

}