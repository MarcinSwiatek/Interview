package org.interview.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.EmptyStackException;

import org.junit.Test;

public class StackTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalStateWhenPushingNull() {
		// given
		Stack mSUT = new StackImplementation();
		// when
		mSUT.push(null);
		// then
	}

	@Test
	public void shouldKeepTrackOfMaxValue() {
		// given
		Stack mSUT = new StackImplementation();
		Double five = new Double(5);
		Double one = new Double(1);
		Double seven = new Double(7);

		// when
		mSUT.push(five);
		mSUT.push(one);
		mSUT.push(seven);

		// then
		assertEquals(seven, mSUT.max());
		assertEquals(seven, mSUT.pop());

		assertEquals(five, mSUT.max());
		assertEquals(one, mSUT.pop());

		assertEquals(five, mSUT.max());
		assertEquals(five, mSUT.pop());
		assertNull(mSUT.max());
	}

	@Test(expected = EmptyStackException.class)
	public void shouldThrowEmptyStackExceptionWhenPoppingEmpty() {
		// given
		Stack mSUT = new StackImplementation();
		// when
		mSUT.pop();
		// then
	}

	@Test(expected = EmptyStackException.class)
	public void shouldThrowEmptyStackExceptionWhenMaxEmpty() {
		// given
		Stack mSUT = new StackImplementation();
		// when
		mSUT.max();
		// then
	}
}
