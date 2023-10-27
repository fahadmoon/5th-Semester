class Seat {
    private String occupant;

    public Seat() {
        occupant = null;
    }

    public void sit(String personName) {
        occupant = personName;
        System.out.println(personName + " is sitting in the seat");
    }

    public void getUp() {
        if (occupant != null) {
            System.out.println(occupant + " got up from the seat");
            occupant = null;
        }
    }
}
