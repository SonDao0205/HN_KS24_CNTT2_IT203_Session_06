public class Bai1 {
    public static class Student {
        String studentId;
        String studentName;
        String dateBirth;
        float avg;

        public Student(String studentId, String studentName, String dateBirth, float avg) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.dateBirth = dateBirth;
            this.avg = avg;
        }

        public void showStudentInfo() {
            System.out.println("----------------Student----------------");
            System.out.println("Student Id: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("Student Date Birth: " + dateBirth);
            System.out.println("Student Avg: " + avg);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("01","nguyen van a","01/01/2000",8);
        Student student2 = new Student("02","nguyen van b","02/01/2000",9);
        student1.showStudentInfo();
        student2.showStudentInfo();
    }
}
