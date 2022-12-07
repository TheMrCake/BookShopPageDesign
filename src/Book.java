public class Book {

    private String title, author, isbn, genre;
    private java.time.LocalDate publishDate;
    private Boolean available;
    private int stock;

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public java.time.LocalDate getPublishDate() {
        return publishDate;
    }

    public Boolean isAvailable() {
        return available;
    }

    public int getStock() {
        return stock;
    }

}
