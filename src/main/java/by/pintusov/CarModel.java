package by.pintusov;

/**
 * Project: Test
 * Created by: USER
 * Date: 13.03.17.
 */

public enum CarModel {
 AUDI (250), BMW (280), BENZ (300), WW(200);

	private int maxSpeed;

	CarModel (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "CarModel=" + this.name() +
				", # " + this.ordinal() +
				", maxSpeed=" + maxSpeed;
	}
}
