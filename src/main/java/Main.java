public class Main {

    public static void main(String[] args) {
        Car carOne = new Car("volvo", 5, engineType.ELECTRIC);
        Car carTwo = new Car("tesla", 7, engineType.DIESEL);

        CarDealership dealershipOne = new CarDealership("Best Cars", 5);


        DealershipService dealershipService = new DealershipService();
        System.out.println(dealershipService.countingCarsMethod(dealershipOne));

     dealershipService.addingCarsMethod(dealershipOne, carOne);
        dealershipService.addingCarsMethod(dealershipOne, carOne);
        dealershipService.addingCarsMethod(dealershipOne, carOne);
        dealershipService.addingCarsMethod(dealershipOne, carOne);
        dealershipService.addingCarsMethod(dealershipOne, carOne);






        System.out.println(dealershipOne);
        System.out.println("there are " + dealershipService.countingCarsMethod(dealershipOne) + " cars in this dealership");


    }
}
