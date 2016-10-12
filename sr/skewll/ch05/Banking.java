package skewll.ch05;
/*Write a program to simulate a bank transaction. There are two bank accounts: checking
and savings. First, ask for the initial balances of the bank accounts; reject negative
balances. Then ask for the transactions; options are deposit, withdrawal, and transfer.
Then ask for the account; options are checking and savings. Reject transactions
that overdraw an account. At the end, print the balances of both accounts.*/

public class Banking {

	private double checking;
	private double savings;

	public Banking(double initCheck, double initSave) {
		checking = initCheck;
		savings = initSave;
	}

	public void depositCheck(double amt) {
		checking += amt;
	}

	public void withdrawCheck(double amt) {
		checking -= amt;
	}

	public void depositSave(double amt) {
		savings += amt;
	}

	public void withdrawSave(double amt) {
		savings -= amt;
	}

	public void transferSavToCheck(double amt) {
		savings -= amt;
		checking += amt;
	}

	public void transferCheckToSav(double amt) {
		checking -= amt;
		savings += amt;
	}

	public double getCheckBal() {
		return checking;
	}

	public double getSaveBal() {
		return savings;
	}

}
