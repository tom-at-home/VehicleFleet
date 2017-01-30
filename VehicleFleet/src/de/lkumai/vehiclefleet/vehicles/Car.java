package de.lkumai.vehiclefleet.vehicles;

public class Car extends Vehicle {
	private int numberOfDoors;
	
	public Car(int price, int seats, int numberOfDoors) {
		super(price, seats);
		this.numberOfDoors = numberOfDoors;
	}
}
