
public class LinkedList<T> implements List<T> {
	
	public class Node<T> {
		public T data;
		public Node<T> next;
		
		public Node(T data) {
			this(data, null);
		}
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<T> first;
	private Node<T> cur;
	
	// constructor for linkedlist. Java will auto set first to null if constructor is not available.
	public LinkedList() {
		first = null;
	}

	public void add(T v) {
		Node<T> end = new Node<T>(v);
		if (first != null) {
			Node<T> cur = first;
			while (cur.next != null) {
				cur = cur.next; 
			}
		} else {
			first = end;
		}
	}

	public int size() 
	{
		int counter = 0;
		if (first != null) {
			Node<T> cur = first;
			while (cur.next != null) {
				cur = cur.next;
				counter++;
			}}
			return counter;
		}

	public boolean remove(int index) {
		return false;
	}

	public void set(int index, T v) {
		
	}

	public T get(int index) {
		return null;
	}

	public void clear() {
		first = null;
	}

	public boolean contains(T v) {
		if (first != null) {
			Node<T> cur = first;
			while (cur != null) {
				if (cur == v){
					return true;
				} else {
					cur = cur.next;
				}
			}
		} 
		return false;
	}

	public int indexOf(T v) {
		int counter = 0;
		if (first != null) {
			Node<T> cur = first;
			while (cur.next != null) {
				if (cur == v){
					return counter;
				} else {
					counter++;
					cur = cur.next;
				}
				
			}}
			return counter;
		}

	public boolean isEmpty() {
		if (first != null) {
			return false;
		}
		else return false;
		}

public void main(String[] args){
	//int[] array = {6,1,3,5,7,2,9,6};
	
	Node<Integer> testNode = new Node<Integer>(44);
	add(<Integer> 44);
	//testNode.linkedlist;
	
	}
}
	
