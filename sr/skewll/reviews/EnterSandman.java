package skewll.reviews;

public class EnterSandman {
	public static void main(String[] args) {
		Party Republican = new Party("Republican Party", 0);
		Party Democratic = new Party("Democratic Party", 0);
		Party Libertarian = new Party("Libertarian Party", 0);
		Party Green = new Party("Green Party", 0);
		Party[] partyHard = { Republican, Democratic, Libertarian, Green };
		Voting machine00 = new Voting();
		for (int i = 0; i < partyHard.length; i++) {
			machine00.setArray(i, partyHard[i]);
		}
		machine00.getResult();
	}
}
