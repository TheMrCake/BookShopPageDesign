public class Book {

    private String title, author, isbn, genre;
    private java.time.LocalDate publishDate;
    private Boolean available;
    private int stock;

    public Book(String title,
            String author,
            String isbn,
            String genre,
            java.time.LocalDate publishDate,
            Boolean available,
            int stock) {

        // initialising lots of variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.publishDate = publishDate;
        this.available = available;
        this.stock = stock;
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

    public void setAvailable(Boolean n) {
        available = n;
    }

    public void setStock(int n) {
        stock = n;
    }

}
