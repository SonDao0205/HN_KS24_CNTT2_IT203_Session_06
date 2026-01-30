public class BTTH {
    public static class BankAccount{
        private String accountNumber;
        private String accountName;
        private float balance;

        public BankAccount() {
        }

        public BankAccount(String accountNumber, String accountName, float balance) {
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            setBalance(balance);
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            if(balance > 0){
                this.balance = balance;
            }else{
                System.out.println("Invalid Balance");
            }
        }

        public void deposit(float amount){
            setBalance(getBalance() + amount);
        }

        public void withdraw(float amount){
            setBalance(getBalance() - amount);
        }

        public void showInfo(){
            System.out.println("---------Account--------");
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Account Name: " + this.accountName);
            System.out.println("Balance: " + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("987654321","nguyen van b",200000);
        BankAccount acc2 = new BankAccount("123456789","nguyen van a",100000);
        acc1.withdraw(30000);
        acc1.showInfo();
        acc2.deposit(50000);
        acc2.showInfo();
    }
}
