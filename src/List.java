
public interface List<T> {

	/**
	 * "add" adds a node to the end of the linked list
	 * @param v, the data within the node
	 */
	public void add(T v);
	
	/**
	 * @return the length of the linked list
	 */
	public int size();
	
	/**
	 * 
	 * @param index
	 * @return false if 
	 */
	public boolean remove(int index);
	
	/**
	 * 
	 * @param index
	 * @param v
	 */
	public void set(int index, T v);
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public T get(int index);
	
	/**
	 * 
	 */
	public void clear();
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	public boolean contains(T v);
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	public int indexOf(T v);
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
}
