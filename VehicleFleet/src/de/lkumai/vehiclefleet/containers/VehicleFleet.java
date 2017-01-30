package de.lkumai.vehiclefleet.containers;

import java.util.ArrayList;

import de.lkumai.vehiclefleet.vehicles.Vehicle;

public class VehicleFleet {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public void add(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void remove(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}
	
	public int calcSum() {
		int sum = 0;
		for (Vehicle vehicle : this.vehicles) {
			sum+=vehicle.getPrice();
		}
		return sum;		
	}
	
	public double calcAvg() {
		double sum = 0;
		for (Vehicle vehicle : this.vehicles) {
			sum+=vehicle.getPrice();
		}
		return sum/(double)this.vehicles.size();
	}
	
	
	
}
