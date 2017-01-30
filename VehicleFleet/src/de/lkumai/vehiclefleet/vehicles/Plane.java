package de.lkumai.vehiclefleet.vehicles;

public class Plane extends Vehicle {
	private int maxHeight;
	
	public Plane(int price, int seats, int maxHeight) {
		super(price, seats);
		this.maxHeight = maxHeight;
	}
}
