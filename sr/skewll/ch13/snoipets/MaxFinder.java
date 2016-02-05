package skewll.ch13.snoipets;

public class MaxFinder {

	public double max(Double[] pioe) {
		double max = 0;
		for (double num : pioe) {
			if (max <= num) {
				max = num;
			}
		}
		return max;
	}

}
