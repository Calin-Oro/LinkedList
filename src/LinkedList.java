
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
	
	private Node<T> first;
	private Node<T> cur;
	
	// constructor for linkedlist. Java will auto set first to null if constructor is not available.
	public LinkedList() {
		first = new Node<T>(null);
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
/*
		} else {
			end.data = v;
			first = end.next;
			//first = end;
		}
		*/

	@Override
	public int size() 
	{
		int counter = 0;
		if (first != null) {
			Node<T> cur = first;
			while (cur.next != null) {
				cur = cur.next;
				counter++;
			}
		}
		return counter;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public void set(int index, T v) {
		
	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public void clear() {
		first = null;
	}

	@Override
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

	@Override
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
				
			}
		}
			return counter;
	}

	@Override
	public boolean isEmpty() {
		if (first != null) {
			return true;
		}
		else 
			return false;
		}

public static void main(String[] args){
	//int[] array = {6,1,3,5,7,2,9,6};
	
	//Node<Integer> testNode = new Node<Integer>(44);
	LinkedList<Integer> test = new LinkedList<Integer>();
	test.add(44);
	test.add(10);
	test.add(100);
	System.out.println(test.size());
	//testNode.linkedlist;
	
	}
}
	
