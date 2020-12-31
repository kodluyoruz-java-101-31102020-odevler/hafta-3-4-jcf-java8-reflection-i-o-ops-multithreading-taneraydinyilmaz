package questionOne;

public class ApplicationStart {

	public static void main(String[] args) {

		TwoWayList<String> listFirst = new TwoWayList<String>();

		System.err.println("===============");
		listFirst.insertFirst("t");
		listFirst.insertFirst("a");
		listFirst.insertFirst("n");
		listFirst.insertFirst("e");
		listFirst.insertFirst("r");
//		listFirst.deleteFirst();
//		listFirst.deleteLast();
//		listFirst.deleteAfter("t"); 
//		listFirst.printLinkedListForward();
//		listFirst.printLinkedListBackward();
		System.err.println("===============");
		listFirst.insertLast("Kod");
		listFirst.insertLast("lu");
		listFirst.insertLast("yo");
		listFirst.insertLast("ruz");
		listFirst.printLinkedListForward();
//		listFirst.printLinkedListBackward();
		System.err.println("===============");

	}

}