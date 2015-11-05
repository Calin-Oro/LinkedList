
public class LinkedList<T> implements List<T> {

	public class Node<T> {

		public T data;
		public Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<T> first = new Node<T>(null, null);
	private Node<T> cur;

	// constructor for linkedlist. Java will auto set first to null if constructor is not available.
	public LinkedList() {
		first = new Node<T>(null, null);
	}

	@Override
	public void add(T v) {
		cur = first;
		Node<T> end = new Node<T>(v, null);
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = end;
	}


	@Override
	public int size() {
		int size = 0;
		cur = first;
		while (cur.next != null) {
			size++;
			cur = cur.next;
		}
		return size;
	}


	@Override
	public boolean remove(int index) {
		cur = first;
		
		
		return false;
	}


	@Override
	public void set(int index, T v) {
		cur = first;
		for (int i = 0; i < index; i++) {
			if (cur == null) {
				throw new IndexOutOfBoundsException();
			}
			cur = cur.next;
		}
		cur.data = v;
	}


	@Override
	public T get(int index) {
		cur = first;
		for (int i = 0; i < index; i++) {
			if (cur == null) {
				throw new IndexOutOfBoundsException();
			}
			cur = cur.next;
		}
		return cur.data;
	}


	@Override
	public void clear() {
		first.next = null;
	}


	@Override
	public boolean contains(T v) {
		if (first.next == null) {
			throw new IllegalStateException();
		} else {
			cur = first;
			while (cur != null) {
				if (cur.data == v) {
					return true;
				} else {
					cur = cur.next;
				}
			}
			return false;
		}
	}


	@Override
	public int indexOf(T v) {
		if (first.next == null) {
			throw new IllegalStateException();
		} else {
			cur = first;
			int index = 0;
			while (cur != null) {
				if (cur.data == v) {
					return index;
				} else {
					cur = cur.next;
					index++;
				}
			}
			
			return -1;
		}
	}


	@Override
	public boolean isEmpty() {
		if (first.next == null) {
			return true;
		} else {
			return false;
		}
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

