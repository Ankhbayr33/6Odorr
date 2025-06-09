package LibraryManagement;

public class LibraryApp {
     public static void main(String[] args) {
        Member member = new Member("reader01", "pass123", "Temuulen", "temuulen@mail.com");
        Librarian librarian = new Librarian("lib01", "adminpass", "Tsetsgee", "Tov nomiin sanch");

        BorrowRecord record = new BorrowRecord("2025-06-10", "Zeelsen", member, librarian, "Java programclal");
        member.addBorrowRecord(record);
        librarian.issueBook(record);

        System.out.println(member);
        System.out.println("Nomiin zeelleg: " + record.getBookTitle() + ", Ognoo: " + record.getDate() + ", Status: " + record.getStatus());
        System.out.println("Nom olgoson nomiin sanch: " + librarian.getName() + ", Salbar: " + librarian.getBranch());

        System.out.println("Zeelsen tuuh:");
        for (BorrowRecord r : member.getBorrowRecords()) {
            System.out.println("- Nom: " + r.getBookTitle() + ", Ognoo: " + r.getDate() + ", Status: " + r.getStatus());
        }
    }
}
