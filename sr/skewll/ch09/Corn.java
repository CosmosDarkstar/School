package skewll.ch09;

public class Corn extends Veggie {
	private double lbs;

	public Corn(double lbs) {
		this.lbs = lbs;
	}

	@Override
	public double getWeight() {

		return lbs;
	}

	@Override
	public void eat() {
		lbs = 0;

	}

}
