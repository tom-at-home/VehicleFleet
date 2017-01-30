package de.lkumai.vehiclefleet.vehicles;

public class ECar extends Car {
	private int capacity;
	
	public ECar(int price, int seats, int numberOfDoors, int capacity) {
		super(price, seats, numberOfDoors);
		this.capacity = capacity;		
	}
}
