package stack;

public class StackWithMin extends Stack{

	private Stack s2;
	
	public StackWithMin(){
		this.s2 = new Stack();
	 }
	
	public void push(int d){
		if(s2.peek() == -1){
			s2.push(d);
		}
		else if(d < s2.peek()){
			s2.push(d);
		}
		super.push(d);
	}
	
	public int pop(){
		int d= super.pop();
		if(d == this.s2.peek()){
			this.s2.pop();
		}
		return d;
	}
	
	public int min(){
		return this.s2.peek();
	}
	
}
