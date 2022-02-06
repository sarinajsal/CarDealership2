import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock;

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay]; //need to understand this?
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return maxCarsOnDisplay == that.maxCarsOnDisplay && Objects.equals(name, that.name) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCarsOnDisplay);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }
}
