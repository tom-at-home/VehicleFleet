package de.lkumai.vehiclefleet.vehicles;

public class SailingShip extends Ship {
	private int numberOfSails;
	public SailingShip(int price, int seats, int draft, int numberOfSails) {
		super(price, seats, draft);
		this.numberOfSails = numberOfSails;
	}
}
