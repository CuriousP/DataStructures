package queue;
import stack.*;

public class QueueUsingStack extends Queue{
	Stack stackNewest, stackOldest;
	
	public QueueUsingStack(){
		stackNewest = new Stack();
		stackOldest = new Stack();
	}
	
	public void add(int value){
		stackNewest.push(value);
	}

	private void shiftStack(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
				}
		}
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	
	public int peek(){
		shiftStack();
		return stackOldest.peek();
	}
	
	public int remove(){
		shiftStack();
		return stackOldest.pop();
	}
}

