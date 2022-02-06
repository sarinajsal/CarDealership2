import java.util.Arrays;

public class DealershipService {

    public int countingCarsMethod(CarDealership carDealership) {
        int counter = 0;
        for (int i = 0; i < carDealership.getCarsInStock().length; i++) {
            if (carDealership.getCarsInStock()[i] != null) {
                counter++;
            }

        }
        return counter;
    }

    public void addingCarsMethod(CarDealership carDealershipObject, Car car) {
        for (int i = 0; i < carDealershipObject.getCarsInStock().length; i++) {
            if (carDealershipObject.getCarsInStock()[i] == null) {
                carDealershipObject.getCarsInStock()[i] = car;
                break;
            }

            }
        }

        public Car findCarByManufacturer(String manufacturerWanted){
            for (Car car:this.carsInStock){

                 ) {

            }
            }


        return Car;
    }

}





