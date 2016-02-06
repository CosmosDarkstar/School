package skewll.ch14.soipets;

import textbook.ch14.section_1.ArrayUtil;

public class BubbleSorter {

	public static void bubbles(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			ArrayUtil.swap(a, i, i + 1);
			i++;
		}
	}
}
