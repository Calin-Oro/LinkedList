
public class ArrayList<T> implements List<T>{
	private T[] data;
	
	private int size;
	
	
	public ArrayList(int capacity) {
		size = 0;
		data = (T[]) new Object[capacity];
	}
	
	public ArrayList() {
		this(10);
	}

	public void add(T v) {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public void set(int index, T v) {
		// TODO Auto-generated method stub
		
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(T v) {
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(T v) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
