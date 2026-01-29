public class Bai2 {
    public static class Account {
        String username;
        String password;
        String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void changePassword(String password) {
            this.password = password;
        }
        public void showAccountInfo() {
            System.out.println("-----------Account-----------");
            System.out.println("Username: " + this.username);
            System.out.println("Email: " + this.email);
        }
    }

    public static void main(String[] args) {
        Account acc = new Account("acc1","123","acc1@gmail.com");
        acc.showAccountInfo();
        acc.changePassword("456");
        acc.showAccountInfo();
    }
}
