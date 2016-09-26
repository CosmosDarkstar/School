package skewll.reviews;

public class Party {
	private String name;
	private int tally;

	public Party(String startName, int startTally) {
		name = startName;
		tally = startTally;
	}

	public int getTally() {
		return tally;
	}

	public String getName() {
		return name;
	}

	private void addVote() {
		tally++;
	}

	private void reset() {
		tally = 0;
	}
}
