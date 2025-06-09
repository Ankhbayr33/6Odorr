package LibraryManagement;
import java.util.ArrayList;
import java.util.List;

public class Librarian extends UserAccount {

        private String name;
    private String branch;
    private List<BorrowRecord> issuedRecords;

    public Librarian(String username, String password, String name, String branch) {
        super(username, password);
        this.name = name;
        this.branch = branch;
        this.issuedRecords = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Librarian";
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void issueBook(BorrowRecord record) {
        issuedRecords.add(record);
    }

    public List<BorrowRecord> getIssuedRecords() {
        return issuedRecords;
    }

    public String toString() {
        return "Nomiin sanch: " + name + ", Salbar: " + branch;
    }
}
