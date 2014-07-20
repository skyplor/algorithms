package datastructures.object_oriented_design.Q8_4_ParkingLot;

public class Car {

    private int id;
    private boolean isParked = false;
    private Lot lot;

    public Car(int id) {
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
     * @return the isParked
     */
    public boolean isParked() {
	return isParked;
    }

    /**
     * @param isParked
     *            the isParked to set
     */
    public void setParked(boolean isParked) {
	this.isParked = isParked;
    }

    /**
     * @return the lot
     */
    public Lot getLot() {
	return lot;
    }

    /**
     * @param lot
     *            the lot to set
     */
    public void setLot(Lot lot) {
	this.lot = lot;
    }

}
