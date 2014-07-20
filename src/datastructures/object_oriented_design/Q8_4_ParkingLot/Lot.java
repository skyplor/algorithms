package datastructures.object_oriented_design.Q8_4_ParkingLot;

public class Lot {
    private int id = 0;
    private boolean hasCar = false;
    private Car parkedCar;

    public Lot(int id) {
	this.setId(id);
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the hasCar
     */
    public boolean hasCar() {
	return hasCar;
    }

    /**
     * @param hasCar
     *            the hasCar to set
     */
    public void setHasCar(boolean hasCar) {
	this.hasCar = hasCar;
    }

    /**
     * @return the parkedCar
     */
    public Car getParkedCar() {
	return parkedCar;
    }

    /**
     * @param parkedCar the parkedCar to set
     */
    public void setParkedCar(Car parkedCar) {
	this.parkedCar = parkedCar;
    }
    
    
}
