package LibraryManagement;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        if (!username.matches("^[a-zA-Z0-9_]{3,15}$")) {
            throw new IllegalArgumentException("Newtreh ner buru formattai baina.");
        }
        if (password.length() < 6) {
            throw new IllegalArgumentException("Nuuts ug hamgiin bagadaa 6 temdegtei baih ystoi.");
        }
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return "User";
    }
}

