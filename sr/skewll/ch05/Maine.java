package skewll.ch05;

public class Maine {

	public static void main(String[] args) {
		Banking jim = new Banking(4, 52);
		jim.depositCheck(12);
		jim.transferSavToCheck(15);
		jim.withdrawCheck(20);
		jim.depositSave(200);
		jim.transferCheckToSav(2);
		jim.withdrawSave(12);
		System.out.println("Checking balance: " + jim.getCheckBal() + ", Savings balance: " + jim.getSaveBal());

	}

}
