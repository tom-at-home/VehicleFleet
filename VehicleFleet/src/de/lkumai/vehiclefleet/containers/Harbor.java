package de.lkumai.vehiclefleet.containers;

import java.util.ArrayList;

import de.lkumai.vehiclefleet.vehicles.Ship;

public class Harbor {
	private ArrayList<Ship> ships = new ArrayList<>();
	
	public void dock(Ship ship) {
		this.ships.add(ship);
	}
	public void depart(Ship ship) {
		this.ships.remove(ship);
	}
	
	public void transfer(Ship ship, Harbor destination) {
		if(!this.ships.contains(ship)) {
			System.out.println("This ship is not docking here!");
			return;
		} 
		/*this.ships.remove(ship);
		destination.ships.add(ship);*/
		
		this.depart(ship);
		destination.dock(ship);
	}
}
