public class Bai6 {
    public static class User{
        private String id;
        private String username;
        private String password;
        private String email;

        public User(String id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if(password.trim().isEmpty()){
                System.out.println("Mật khẩu không hợp lệ");
            }else{
                this.password = password;
            }

        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if(email.endsWith("@gmail.com")){
                this.email = email;
            }else{
                System.out.println("Email không hợp lệ!");
            }
        }

        public void showInfo(){
            System.out.println("-----------User----------");
            System.out.println("Id: "+id);
            System.out.println("Username: "+username);
            System.out.println("Email: "+email);
        }
    }

    public static void main(String[] args) {
        User u1 = new User("U01", "nguyenvana", "123456", "vana@gmail.com");
        u1.showInfo();
        User u2 = new User("U02", "tranthib", "123456", "thib@gmail.com");
        u2.showInfo();
        User u3 = new User("U03", "leminhc", "123456", "leminhc@yahoo.com");
        u3.showInfo();

        User u4 = new User("U04", "phamvand", "    ", "vand@gmail.com");
        u4.showInfo();

    }
}
