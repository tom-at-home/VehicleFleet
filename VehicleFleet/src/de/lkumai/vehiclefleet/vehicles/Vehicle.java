package de.lkumai.vehiclefleet.vehicles;

public class Vehicle {
	private int price;
	private int seats;
	
	public Vehicle(int price, int seats) {
		this.price = price;
		this.seats = seats;
	}
	
	public int getPrice() {
		return this.price;
	}
}
