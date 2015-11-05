
public interface List<T> {
	/**
	 * This method adds the element v to the end of the list.
	 * @param v, the data within the node
	 */
	public void add(T v);
	
	/**
	 * @return the number of elements in the list
	 */
	public int size();
	
	/**
	 * This method removes the element at the given index in the list.
	 * @param index, the index of the node in the list
	 * @return false if the list does not include given node
	 */
	public boolean remove(int index);
	
	/**
	 * This method sets the index of the list to the given value.
	 * @param index, the index of the node in the list
	 * @param v, a generic
	 */
	public void set(int index, T v);
	
	/**
	 * @param index, the index of the node in the list
	 * @return the element at the given index of the list
	 */
	public T get(int index);
	
	/**
	 * This method removes all the elements of the list.
	 */
	public void clear();
	
	/**
	 * @param v, a generic
	 * @return true if a node contains v in the list
	 */
	public boolean contains(T v);
	
	/**
	 * @param v, a generic
	 * @return the index of the first occurrence of v in the list
	 */
	public int indexOf(T v);
	
	/**
	 * @return true if the list is empty
	 */
	public boolean isEmpty();
}
