package LibraryManagement;

public class BorrowRecord {
    private String date;
    private String status;
    private Member member;
    private Librarian librarian;
    private String bookTitle;

    public BorrowRecord(String date, String status, Member member, Librarian librarian, String bookTitle) {
        this.date = date;
        this.status = status;
        this.member = member;
        this.librarian = librarian;
        this.bookTitle = bookTitle;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Member getMember() {
        return member;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return member + "\nNom: " + bookTitle + ", Ognoo: " + date + ", Status: " + status + "\n" + librarian;
    }
}

