package de.lkumai.vehiclefleet.program;

import de.lkumai.vehiclefleet.containers.Lot;
import de.lkumai.vehiclefleet.containers.VehicleFleet;
import de.lkumai.vehiclefleet.vehicles.ECar;
import de.lkumai.vehiclefleet.vehicles.OttoCar;
import de.lkumai.vehiclefleet.vehicles.PropellerDriverAircraft;
import de.lkumai.vehiclefleet.vehicles.SailingShip;
import de.lkumai.vehiclefleet.vehicles.Sailplane;
import de.lkumai.vehiclefleet.vehicles.VikingLongboat;

public class Program {

	public static void main(String[] args) {				
		ECar eCar = new ECar(34000, 2, 2, 12000);
		OttoCar ottoCar = new OttoCar(6000, 5, 4, 15.5);
		
		
		SailingShip sailingShip = new SailingShip(120000, 1, 1, 1);
		SailingShip sailingShip2 = new SailingShip(220000, 2, 2, 3);
		VikingLongboat vikingLongboat = new VikingLongboat(15000, 24, 4, 22);
		
		PropellerDriverAircraft bmw = new PropellerDriverAircraft(13000, 4, 6000, 1);
		PropellerDriverAircraft fokker = new PropellerDriverAircraft(100000, 1, 5000, 1);
		Sailplane sailplane = new Sailplane(22200, 2, 2500, 30);
		
		Lot lot = new Lot();
		Lot lot2 = new Lot();
		lot.park(eCar);
		lot.park(ottoCar);
		
		System.out.println("Lot:");
		lot.show();
		System.out.println("Lot2:");
		lot2.show();
		System.out.println("Transfer ECar from lot to lot2");
		lot.transfer(eCar, lot2);
		System.out.println("Lot:");
		lot.show();
		System.out.println("Lot2:");
		lot2.show();
		
		VehicleFleet vehicleFleet = new VehicleFleet();
		vehicleFleet.add(eCar);
		vehicleFleet.add(ottoCar);
		vehicleFleet.add(sailingShip);
		vehicleFleet.add(sailingShip2);
		vehicleFleet.add(vikingLongboat);
		vehicleFleet.add(bmw);
		vehicleFleet.add(fokker);
		vehicleFleet.add(sailplane);
		System.out.println("Sum:" + vehicleFleet.calcSum());
		System.out.println("Avg:" + vehicleFleet.calcAvg());
	}

}

