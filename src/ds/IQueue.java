package ds;

public interface IQueue extends ICommon {
	void enqueue(int data);
	int dequeue();
}
