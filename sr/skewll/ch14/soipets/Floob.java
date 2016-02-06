package skewll.ch14.soipets;

import textbook.ch14.section_1.ArrayUtil;

public class Floob {

	private static int minimumPosition(String[] a, int from) {
		int minPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i].length() > a[minPos].length()) {
				minPos = i;
			}
		}
		return minPos;
	}

	public static void sortByMin(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = minimumPosition(a, i);
			ArrayUtil.swap(a, minPos, i);
		}
	}
}
