package ds;

public class Queue extends Common implements IQueue {

	@Override
	public void enqueue(int data) {
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
	public int dequeue() {
		if(head == null) {
			return 0;
		}else {
			Node temp = head;
			head = temp.nextNodeOfRef;
			return temp.data;
		}
	}

}
