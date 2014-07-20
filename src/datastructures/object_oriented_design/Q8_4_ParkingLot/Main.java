package datastructures.object_oriented_design.Q8_4_ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a parking lot using object-oriented principles
 * 
 * @author Sky
 * 
 */
public class Main {
    static int num_of_cars = 10;
    static int num_of_lots = 20;

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Carpark cp = new Carpark(num_of_lots);
	List<Car> cars = generateCars(num_of_cars);
	for (Car c : cars) {
	    cp.park(c, cp.getNextAvailableLot());
	}
	int count = num_of_cars;
	while (!cars.isEmpty()) {
	    int n = (int) (Math.random() * count);
	    Car c = cars.get(n);
	    cp.leave(c);
	    cars.remove(c);
	    count--;
	}
    }

    public static List<Car> generateCars(int n) {
	List<Car> cars = new ArrayList<Car>();
	for (int i = 0; i < n; i++)
	    cars.add(new Car(i + 1));
	return cars;
    }
}
