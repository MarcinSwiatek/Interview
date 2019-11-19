package org.interview.Stack;

/**
 * Stack interface.
 * 
 * @author marcinswiatek
 *
 */
public interface Stack {
	/**
	 * Removes and returns last inserted number into that stack in O(1)
	 * 
	 * @return Last inserted number.
	 */
	public Double pop();

	/**
	 * Inserts new number into the stack in O(1)
	 * 
	 */
	public void push(Double number);

	/**
	 * Returns the biggest number in the stack in O(1).
	 * 
	 * @return
	 */
	public Double max();
}
