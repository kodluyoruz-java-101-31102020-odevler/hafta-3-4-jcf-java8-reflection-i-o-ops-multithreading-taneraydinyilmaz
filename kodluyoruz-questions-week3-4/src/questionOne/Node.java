package questionOne;

public class Node<T> {

	public T data;
	public Node<T> next;
	public Node<T> prev;
 
	public void displayNodeData() {
		System.out.print("{ " + data + " } ");
	}
}
