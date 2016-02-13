package skewll.ch13.snoipets;

import java.util.ArrayList;

public class SubSetzzzzzz {
	private String ferzt;
	private String left;
	private ArrayList<String> subz;

	public void subsss(String forp) {
		ferzt = forp;
		left = forp;

		if (left.length() == 1) {
			subz.add(left);
			return;
		} else {

			String removed = left.substring(0, 1);
			left = left.substring(1);

			subsss(left);

			int size = subz.size();

			for (int i = 0; i < size; i++) {
				String temp = removed + subz.get(i);
				subz.add(temp);
			}
			subz.add(removed);
			return;
		}
	}

}
