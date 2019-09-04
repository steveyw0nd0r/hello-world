package assignment02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import components.set.AbstractSet;

/**
 * {@code Set<E>} represented as a {@code java.util.ArrayList<E>} with
 * implementation of primary methods.
 * 
 * @author Swaroop Joshi
 *
 * @param <E> type of element
 */
public class SetOnArrayList<E> extends AbstractSet<E> {
	/*
	 * Private members
	 */
	/**
	 * Underlying ArrayList representation
	 */
	private List<E> rep;

	/*
	 * TODO If you need any other private members --variables or methods-- add them
	 * here with a one-line javadoc comment describing each. Otherwise remove this
	 * comment.
	 */
	
	// ----------------------------------------------------------------
	/**
	 * No-argument constructor; builds an empty set.
	 * 
	 */
	public SetOnArrayList() {
		rep = new ArrayList<E>();
	}

	@Override
	public void add(E x) {
		if (this.contains(x))
			return;
		this.rep.add(x);
	}

	@Override
	public boolean contains(E x) {
		assert x != null : "Violation of x is not null";
		Iterator<E> iterator = this.rep.iterator();
		E data = null;
		while (iterator.hasNext())
			data = iterator.next();
			if (data == x)
			return true;
		return false; 
	}

	@Override
	public void remove(E x) {
		assert x != null : "Violation of x is not null";
		assert this.contains(x) : "Violation of x is in this";
		this.rep.remove(x);
	}

	@Override
	public int size() {
		return this.rep.size();
	}

	// ----------------------------------------------------------------

	/*
	 * Already implemented for you
	 */
	@Override
	public Iterator<E> iterator() {
		return this.rep.iterator();
	}

}