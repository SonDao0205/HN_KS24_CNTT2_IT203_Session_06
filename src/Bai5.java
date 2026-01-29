public class Bai5 {
    public static class Book{
        String bookId;
        String bookName;

        public Book(String bookId, String bookName) {
            this.bookId = bookId;
            this.bookName = bookName;
        }

        public void showBook(){
            System.out.println("id : "+bookId);
            System.out.println("name : "+bookName);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("1", "Bai");
        book1.showBook();
    }
}
