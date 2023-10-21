public class Main {
    public static void main(String[] args) {
        house myHouse = new house(3);

        myHouse.addRoom(0, 200.0, "Living Room");
        myHouse.addRoom(1, 150.0, "Bedroom");
        myHouse.addRoom(2, 100.0, "Kitchen");

        Room livingRoom = myHouse.getRoom(0);
        Room bedroom = myHouse.getRoom(1);
        Room kitchen = myHouse.getRoom(2);
        System.out.println("Living Room Area: " + livingRoom.getArea() + " sq. ft");
        System.out.println("Living Room Color: " + livingRoom.getColor());
        System.out.println("Bedroom Area: " + bedroom.getArea() + " sq. ft");
        System.out.println("Bedroom Color: " + bedroom.getColor());
        System.out.println("Kitchen Area: " + kitchen.getArea() + " sq. ft");
        System.out.println("Kitchen Color: " + kitchen.getColor());

    }}