package sample;

public class StackLogic {
	Node top;

	public void push(int data) {
		Node n=new Node();
		if(top==null) {
			n.data=data;
			n.next=null;
			top=n;
		}
		else {
			n.data=data;
			n.next=top;
			top=n;
		}
	}
	public void pop() {
		Node n1=top;
		if(top==null) {
			System.out.println("empty stack");
		}
		else {
			n1=top;
			int data = top.data;
			System.out.print("\n delted"+top.data+"\n");
			top=top.next;
			n1.next=null;
			
		}
	}
	public void show() {
		Node n1;
		if(top==null) {
			System.out.println("empty stack");
		}
		else {
			n1=top;
			while(n1!=null) {
				System.out.print(" "+n1.data);
				n1=n1.next;
			}
		}
	}
	
}
