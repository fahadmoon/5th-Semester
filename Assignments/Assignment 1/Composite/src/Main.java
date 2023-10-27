public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
        myCar.drive();
        myCar.park();
        myCar.occupySeat(2, "Fahad");
        myCar.occupySeat(0, "Mehboob");
        myCar.vacateSeat(2);
        myCar.occupySeat(3, "zaibi");

    }
}
