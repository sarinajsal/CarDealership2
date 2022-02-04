public class DealershipService {

    public int countingCars(CarDealership carDealership) {
        int count = 0;
        for (int i = 0; i < carDealership.getCarsInStock().length; i++) { //loop through array InStock from carDealership class
            if (carDealership.getCarsInStock()[i] != null) { //if index i is not equal to null there must be a car, therefore count
                count++;
            }

        }
        return count;

    }
    public void addCar(CarDealership carDealership, Car car) {

        for (int i = 0; i < carDealership.getCarsInStock().length; i++) { //loop through array InStock from carDealership class
            if (carDealership.getCarsInStock()[i] == null) { //if index i is equal to null, there is a space. You can then add car.
                carDealership.getCarsInStock()[i] = car; // car added to index point i
                break;
            }
        }
    }
}
