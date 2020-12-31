package questionOne;

public class TwoWayList<T> {

	private Node<T> head;
	private Node<T> tail;
	int size;

	public boolean isEmpty() {
		return (head == null);
	}

	// listenin ba��na bir d���m eklemek i�in kullan�l�r
	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = head;
		newNode.prev = null;
		if (head != null)
			head.prev = newNode;
		head = newNode;
		if (tail == null)
			tail = newNode;
		size++;
	}

	// listenin ba��na bir d���m eklemek i�in kullan�l�r "sondan"
	public void insertLast(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = tail;
		if (tail != null)
			tail.next = newNode;
		tail = newNode;
		if (head == null)
			head = newNode;
		size++;
	}

	// listenin ba��ndan d���m� silmek i�in kullan�l�r
	public Node<T> deleteFirst() {

		if (size == 0)
			throw new RuntimeException("Liste bo�");
		Node<T> temp = head;
		head = head.next;
		head.prev = null;
		size--;
		return temp;
	}

	// listenin sonundan d���m� silmek i�in kullan�l�r
	public Node<T> deleteLast() {

		Node<T> temp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		return temp;
	}

	// Belirlenen d���m� silmek i�in
	public Node<T> deleteAfter(T value) {

		Node<T> temp = head;
		while (temp.data != value) {
			temp = temp.next;
			if (temp == null)
				return null;
		}
		if (temp == head)
			head = temp.next;
		else
			temp.prev.next = temp.next;

		if (temp == tail)
			tail = temp.prev;
		else
			temp.next.prev = temp.prev;
		
		return temp;

	}

	// Listeyi ileriye yazd�rmak i�in "soldan sa�a"
	public void printLinkedListForward() {
		System.out.println("�ift Ba�lant�l� Liste - Soldan | Sa�a - ");
		Node<T> current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	// Listeyi ileriye yazd�rmak i�in "sa�dan sola"
	public void printLinkedListBackward() {
		System.out.println("�ift Ba�lant�l� Liste - Sa�dan | Sola - ");
		Node<T> current = tail;
		while (current != null) {
			current.displayNodeData();
			current = current.prev;
		}
		System.out.println();
	}
}
