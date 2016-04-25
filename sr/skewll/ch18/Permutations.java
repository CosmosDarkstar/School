package skewll.ch18;

import java.util.ArrayList;

/**
 * This program computes permutations of a string.
 */
public class Permutations {
	public static void main(String[] args) {

	}

	/**
	 * Gets all permutations of a given init.
	 * 
	 * @param init
	 *            the string to permute
	 * @return a list of all permutations
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> T permutations(T[] t) {

		T init = t[0];

		ArrayList<T> result = new ArrayList<T>();
		// The empty string has a single permutation: itself
		if (((String) init).length() == 0) {
			result.add(init);
			return (T) result;
		} else {
			// Loop through all character positions
			for (int i = 0; i < ((String) init).length(); i++) {
				// Form a shorter init by removing the ith character
				T shorter = (T) (((String) init).substring(0, i) + ((String) init).substring(i + 1));

				// Generate all permutations of the simpler init
				// ArrayList<T> shorterPermutations = permutations(shorter);

				// Add the removed character to the front of
				// each permutation of the simpler init,
				// for (T s : shorterPermutations) {
				// result.add(((String) init).charAt(i) + s);
				// }
			}
			// Return all permutations
			return (T) result;
		}
	}
}
