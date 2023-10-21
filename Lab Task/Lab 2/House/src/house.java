public class house {
    private Room[] rooms;

    public house(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
    }

    public void addRoom(int roomNumber, double area, String color) {
        if (roomNumber >= 0 && roomNumber < rooms.length) {
            rooms[roomNumber] = new Room(area, color);
        }
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber >= 0 && roomNumber < rooms.length) {
            return rooms[roomNumber];
        }
        return null;
    }
}
