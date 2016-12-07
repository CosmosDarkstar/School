package skewll.ch09;

public class Beef extends Meat {
	private double oz;

	public Beef(int oz) {
		this.oz = oz;
	}

	@Override
	public double getOz() {
		return oz;

	}

	@Override
	public void eat() {
		oz = 0;

	}

}
