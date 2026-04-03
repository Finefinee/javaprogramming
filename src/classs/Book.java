package classs;

public class Book {

    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void info() {
        System.out.printf("%s - %s / %d원", this.title, this.author, this.price);
    }
}
