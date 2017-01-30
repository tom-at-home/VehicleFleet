package de.lkumai.vehiclefleet.vehicles;

public class Ship extends Vehicle {
	private int draft;
	
	public Ship(int price, int seats, int draft) {
		super(price, seats);
		this.draft = draft;
	}
}
