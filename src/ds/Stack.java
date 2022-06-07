package ds;

public class Stack extends Common implements IStack {

	@Override
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.nextNodeOfRef != null) {
				temp = temp.nextNodeOfRef;
			}
			temp.nextNodeOfRef = newNode;
		}
	}

	@Override
	public int pop() {
		Node temp = head;
		Node prev = head;
		while(temp.nextNodeOfRef != null) {
			prev = temp;
			temp = temp.nextNodeOfRef;
		}
		prev.nextNodeOfRef = null;
		return temp.data;
	}

	@Override
	public int peek() {
		Node temp = head;
		while(temp.nextNodeOfRef != null) {
			temp = temp.nextNodeOfRef;
		}
		return temp.data;
	}	
}
