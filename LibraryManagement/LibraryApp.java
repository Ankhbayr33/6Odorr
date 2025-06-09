package LibraryManagement;

public class LibraryApp {
      public static void main(String[] args) {
        try {
            Member member = new Member("reader01", "pass123", "Temuulen", "temuulen@mail.com");
            Librarian librarian = new Librarian("lib01", "adminpass", "Tsetsgee", "Tov nomiin san");

            // Зөв зээллэг
            BorrowRecord r1 = new BorrowRecord("2025-06-10", "Zeelsen", member, librarian, "Java programming 1");
            member.addBorrowRecord(r1);
            librarian.issueBook(r1);

            System.out.println(member);
            System.out.println("Nomiin zeelleg: " + r1.getBookTitle() + ", Ognoo: " + r1.getDate() + ", Status: " + r1.getStatus());
            System.out.println("Nom olgoson nomiin sanch: " + librarian.getName() + ", Salbar: " + librarian.getBranch());

            System.out.println("Zeelsen tuuh:");
            for (BorrowRecord r : member.getBorrowRecords()) {
                System.out.println("- Nom: " + r.getBookTitle() + ", Ognoo: " + r.getDate() + ", Status: " + r.getStatus());
            }

            // Алдаатай зээллэг (номын нэр хоосон)
            BorrowRecord r2 = new BorrowRecord("2025-06-11", "Zeelsen", member, librarian, " ");
            member.addBorrowRecord(r2);

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("⚠ Aldaa: " + e.getMessage());
        }
    }
}
