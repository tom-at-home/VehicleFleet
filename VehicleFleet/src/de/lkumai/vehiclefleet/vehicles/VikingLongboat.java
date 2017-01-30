package de.lkumai.vehiclefleet.vehicles;

public class VikingLongboat extends Ship {
	private int numberOfOarsmen;
	
	public VikingLongboat(int price, int seats, 
			int draft, int numberOfOarsmen) {
		super(price, seats, draft);
		this.numberOfOarsmen = numberOfOarsmen;
	}

}
