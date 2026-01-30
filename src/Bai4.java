public class Bai4 {
    public static class Employee{
        String employeeId;
        String employeeName;
        float salary;

        public Employee() {
        }

        public Employee(String employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        public Employee(String employeeId, String employeeName, float salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }

        public void showInfo(){
            System.out.println("----------Employee----------");
            System.out.println("Employee Id: "+employeeId);
            System.out.println("Employee Name: "+employeeName);
            System.out.println("Salary: "+salary);
        }
    }

    public static void main(String[] args) {
        Employee em1 = new Employee();
        Employee em2 = new Employee("01","nguyen van a");
        Employee em3 = new Employee("02","nguyen van b",100);
        em1.showInfo();
        em2.showInfo();
        em3.showInfo();
    }
}
