package datastructures.object_oriented_design.Q8_4_ParkingLot;

public class Carpark {
    Lot[] lots;

    public Carpark(int space) {
	lots = new Lot[space];
	for (int i = 0; i < space; i++) {
	    lots[i] = new Lot(i + 1);
	}
    }

    /**
     * Parks the car.
     * 
     * @param car
     *            the car
     * @param lot
     *            the lot
     */
    public void park(Car car, Lot lot) {
	// parks car into a lot
	car.setLot(lot);
	car.setParked(true);
	lot.setHasCar(true);
	lot.setParkedCar(car);
	System.out.println("Car " + car.getId() + " parks at Lot " + lot.getId());
    }

    /**
     * When the car leaves the lot.
     * 
     * @param car
     *            the car
     */
    public void leave(Car car) {
	if (car.isParked()) {
	    Lot l = car.getLot();
	    l.setHasCar(false);
	    l.setParkedCar(null);
	    car.setLot(null);
	    car.setParked(false);
	    System.out.println("Car " + car.getId() + " leaves Lot " + l.getId());
	}
    }

    /**
     * @return the lots
     */
    public Lot[] getLots() {
	return lots;
    }

    /**
     * @param lots
     *            the lots to set
     */
    public void setLots(Lot[] lots) {
	this.lots = lots;
    }

    public Lot getNextAvailableLot() {
	for (int i = 0; i < lots.length; i++)
	    if (!lots[i].hasCar())
		return lots[i];
	return null;
    }

    public Lot getRandomAvailableLot() {
	if (getNextAvailableLot() == null)
	    return null;
	int n = (int) Math.random() * lots.length;
	while (lots[n].hasCar()) {
	    n = (int) Math.random() * lots.length;
	}
	return lots[n];
    }
}
