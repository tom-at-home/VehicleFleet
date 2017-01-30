package de.lkumai.vehiclefleet.vehicles;

public class PropellerDriverAircraft extends Plane {
	private int numberOfPropellers;
	public PropellerDriverAircraft(int price, int seats,
			int maxHeight, int numberOfPropellers) {
		super(price, seats, maxHeight);
		this.numberOfPropellers = numberOfPropellers;
	}
		
}
