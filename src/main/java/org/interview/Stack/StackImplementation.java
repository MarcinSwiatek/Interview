package org.interview.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack implementation with constant time operations.
 * 
 * @author marcinswiatek
 *
 */
public class StackImplementation implements Stack {
	private List<Double> stack = new ArrayList<>();
	private List<Double> biggestNumbersStack = new ArrayList<>();

	/** {@inheritDoc} */
	public Double pop() {

		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}

		biggestNumbersStack.remove(biggestNumbersStack.size() - 1);

		return stack.remove(stack.size() - 1);
	}

	/** {@inheritDoc} */
	public void push(Double number) {
		if (number == null) {
			throw new IllegalArgumentException("Can not push null!");
		}

		if (isNewNumberTheBiggest(number)) {
			biggestNumbersStack.add(number);
		} // current biggest is still the biggest
		else {
			Double currentBiggest = biggestNumbersStack.get(biggestNumbersStack.size() - 1);
			biggestNumbersStack.add(currentBiggest);
		}

		stack.add(number);
	}

	/** {@inheritDoc} */
	public Double max() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}

		return biggestNumbersStack.get(biggestNumbersStack.size() - 1);
	}

	private boolean isNewNumberTheBiggest(Double number) {
		if (stack.isEmpty()) {
			return true;
		}

		Double currentBiggest = biggestNumbersStack.get(biggestNumbersStack.size() - 1);

		return currentBiggest.compareTo(number) < 0;
	}

}
