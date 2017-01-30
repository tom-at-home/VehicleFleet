package de.lkumai.vehiclefleet.vehicles;

public class Sailplane extends Plane {
	private int wingspread;
	public Sailplane(int price, int seats, int maxHeight, int wingspread) {
		super(price, seats, maxHeight);
		this.wingspread = wingspread;
	}
}
