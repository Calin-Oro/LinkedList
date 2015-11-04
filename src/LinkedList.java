
public class LinkedList<T> implements List<T> {
	
public class Node<T> {
		
		public T data;
		public Node<T> next;
		
		public Node(T d) {
			this.data = d;
			this.next = null;
		}
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<T> first = new Node<T>(null);
	private Node<T> cur;
	
	// constructor for linkedlist. Java will auto set first to null if constructor is not available.
	public LinkedList() {
		first = new Node<T>(null);
		//first = null;
	}

	@Override
	public void add(T v) {
		Node<T> end = new Node<T>(v);
		cur = first;

		//if (first != null) {
			while (cur.next != null) {
				cur = cur.next; 
			}
			cur.next =end;
	}


	@Override
	public int size() 
	{
		int counter = 0;
		if (first != null) {
			cur = first;
			while (cur.next != null) {
				cur = cur.next;
				counter++;
			}
		}
		return counter;
	}

	//unimp
	@Override
	public boolean remove(int index) {
		return false;
	}

	//unimp
	@Override
	public void set(int index, T v) {
		
	}

	// gen pwoblem bo isit
	@Override
	public T get(int index) {

		int counter = 0;
		if (first != null) {
			cur = first;
			while (cur.next != null) {
				cur = cur.next;
				counter++;

				if (counter == index){
					return cur.data;
				}
			}
		}
		throw new IndexOutOfBoundsException();
	}

	@Override
	public void clear() {
		first.next = null;
	}

	@Override
	public boolean contains(T v) {
		if (first != null) {
			cur = first;
			while (cur != null) {
				if (cur.data == v){
					return true;
				} else {
					cur = cur.next;
				}
			}
		} 
		return false;
	}

	@Override
	public int indexOf(T v) {
		int counter = 0;
		if (first != null) {
			cur = first;
			while (cur != null) 
			{
				if (cur.data == v){
					return counter;
				} else 
				{
					counter++;
					cur = cur.next;
				}
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if (first.next == null) {
			return true;
		}
		else 
			return false;
		}

public static void main(String[] args){
	//int[] array = {6,1,3,5,7,2,9,6};
	
	//Node<Integer> testNode = new Node<Integer>(44);
	LinkedList<Integer> test = new LinkedList<Integer>();
	System.out.println(test.isEmpty());
	test.add(44);
	System.out.println(test.size());
	System.out.println(test.isEmpty());
	test.add(10);
	test.add(100); 
	System.out.println(test.size());
	System.out.println(test.contains(44));
	System.out.println(test.contains(100));
	System.out.println(test.contains(474));
	System.out.println(test.indexOf(474));
	System.out.println(test.indexOf(100));
	System.out.println(test.indexOf(10));
	test.clear();
	System.out.println("Clearing list");
	System.out.println(test.indexOf(10));
	System.out.println(test.isEmpty());
	//System.out.println(test.get(1));
	
	
	}
}
	
