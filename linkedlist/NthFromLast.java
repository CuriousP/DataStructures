package linkedlist;

public class NthFromLast {

	public static Node nthFromLast (Node n, int k){
		if(k <= 0){
			return null;
		}
		
		Node p1 = n;
		Node p2 = n;
		
		for(int i = 0; i < k-1; i++){
			if(p2 == null){
				return null;
			}
			p2 = p2.next;
		}
		if(p2 == null)
			return null;
		
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
