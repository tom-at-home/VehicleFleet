package de.lkumai.vehiclefleet.containers;

import java.util.ArrayList;

import de.lkumai.vehiclefleet.vehicles.Plane;

public class Airport {
	private ArrayList<Plane> planes = new ArrayList<>();
	
	public void land(Plane plane) {
		this.planes.add(plane);
	}
	
	public void takeOff(Plane plane) {
		this.planes.remove(plane);
	}
	
	public void transfer(Plane plane, Airport destination) {
		if(!this.planes.contains(plane)) {
			System.out.println("This aircraft is not standing here!");
			return;
		}
		this.takeOff(plane);
		destination.land(plane);
	}
}
