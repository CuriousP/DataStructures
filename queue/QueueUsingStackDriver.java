package queue;


public class QueueUsingStackDriver {
				
		public static void main(String[] args) {
			
			QueueUsingStack s = new QueueUsingStack();
			s.add(7);
			s.add(10);
			System.out.println(s.peek());
			System.out.println("Size of the queue: " + s.size());
			s.add(8);
			s.remove();
			System.out.println("Size of the queue: " + s.size());
			s.add(9);
			System.out.println("Size of the queue: " + s.size());
			s.remove();
			System.out.println(s.peek());
			System.out.println("Size of the queue: " + s.size());
			s.remove();
			System.out.println(s.peek());
			System.out.println("Size of the queue: " + s.size());
	}
}
