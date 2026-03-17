package tp1;

public class test {

	public static void main(String[] args) {
		
		MySimpleLinkedList<Integer> ls = new MySimpleLinkedList<>();
		
		ls.insertFront(10);
		ls.insertFront(9);
		ls.insertFront(8);
		ls.insertFront(7);
		ls.insertFront(6);
		ls.insertFront(5);
		ls.insertFront(4);
		ls.insertFront(3);
		ls.insertFront(2);
		ls.insertFront(1);
		
		System.out.println(ls);
		System.out.println(ls.indexOf(11));
	}

}
