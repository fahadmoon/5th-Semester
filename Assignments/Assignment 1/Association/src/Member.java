class Member {
    private String name;
    public Member(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void borrowBook(String bookTitle) {
        System.out.println(name + " has borrowed the book: " + bookTitle);
    }
}
