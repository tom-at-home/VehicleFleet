package de.lkumai.vehiclefleet.vehicles;

public class OttoCar extends Car {
	private double consumption;
	public OttoCar(int price, int seats, 
			int numberOfDoors, double consumption) {
		super(price, seats, numberOfDoors);
		this.consumption = consumption;
	}
}
