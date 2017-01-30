package de.lkumai.vehiclefleet.containers;

import java.util.ArrayList;

import de.lkumai.vehiclefleet.vehicles.Car;

public class Lot {	
	private ArrayList<Car> cars = new ArrayList<>();
	
	 public void park(Car car) {
		 this.cars.add(car);
	 }
	 
	 public void leave(Car car) {
		 this.cars.remove(car);
	 }
	 public void transfer(Car car, Lot destination) {
		 if(!this.cars.contains(car)) {
			 System.out.println("This car is not parking here!");
		 }
		 this.leave(car);
		 destination.park(car);
	 }
	 public void show() {
		for (Car car : cars) {
			System.out.println(car);
		}
	 }
}
