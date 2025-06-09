package LibraryManagement;
import java.util.ArrayList;
import java.util.List;

public class Member extends UserAccount {
    private String fullName;
    private String email;
    private List<BorrowRecord> borrowRecords;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(String username, String password, String fullName, String email) {
        super(username, password);
        this.fullName = fullName;
        this.email = email;
        this.borrowRecords = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Member";
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void addBorrowRecord(BorrowRecord record) {
        if (borrowRecords.size() >= MAX_BORROW_LIMIT) {
            throw new IllegalStateException("Neg hereglegch 5aas iluu nom zeelj bolohgui!");
        }
        borrowRecords.add(record);
    }

    public List<BorrowRecord> getBorrowRecords() {
        return borrowRecords;
    }

    public String toString() {
        return "Gishuun: " + fullName + ", Email: " + email;
    }
}
