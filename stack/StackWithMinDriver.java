package stack;

public class StackWithMinDriver {

	public static void main(String[] args) {
		
		StackWithMin s = new StackWithMin();
		s.push(3);
		System.out.println("Min: " + s.min());
		s.push(2);
		System.out.println("Min: " + s.min());
		s.push(1);
		System.out.println("Min: " + s.min());
		s.push(8);
		System.out.println("Min: " + s.min());
		s.push(4);
		System.out.println("Min: " + s.min());
		s.pop();
		System.out.println("Min: " + s.min());
		s.pop();
		System.out.println("Min: " + s.min());
		s.pop();
		System.out.println("Min: " + s.min());
	

	}

}
