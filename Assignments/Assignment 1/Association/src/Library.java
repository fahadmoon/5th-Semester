class Library {
    public void checkOutBook(Member member, String bookTitle) {
        System.out.println("Library: Checking out the book: " + bookTitle);
        member.borrowBook(bookTitle);
    }
}