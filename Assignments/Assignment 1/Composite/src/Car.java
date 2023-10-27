class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Seat[] seats;

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        seats = new Seat[5];

        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }

        for (int i = 0; i < 5; i++) {
            seats[i] = new Seat();
        }
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }

    public void drive() {
        for (Wheel wheel : wheels) {
            wheel.rotate();
        }
        System.out.println("Car is moving");
    }

    public void park() {
        System.out.println("Car is parked");
    }

    public void occupySeat(int seatNumber, String personName) {
        if (seatNumber >= 0 && seatNumber < seats.length) {
            seats[seatNumber].sit(personName);
        } else {
            System.out.println("Invalid seat number");
        }
    }

    public void vacateSeat(int seatNumber) {
        if (seatNumber >= 0 && seatNumber < seats.length) {
            seats[seatNumber].getUp();
        } else {
            System.out.println("Invalid seat number");
        }
    }
}
