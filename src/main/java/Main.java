public class Main {

    public static void main(String[] args) {
        Car carOne = new Car("volvo",5,engineType.ELECTRIC);
        Car carTwo = new Car("tesla",7,engineType.DIESEL);

        CarDealership dealershipOne = new CarDealership("Best Cars",5);

        System.out.println(carOne);

        DealershipService dealershipService = new DealershipService();
        dealershipService.addCar(dealershipOne, carOne);
        System.out.println(dealershipService.countingCars(dealershipOne));
    }
}
