public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Fahad");
        Member member2 = new Member("Mehboob");
        Library library = new Library();
        library.checkOutBook(member1, "Introduction to Java");
        library.checkOutBook(member2, "Programming in Python");
    }
}
