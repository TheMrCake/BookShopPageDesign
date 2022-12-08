
public class AudioBook extends Book {

    private String narrator;

    public AudioBook(String title,
            String author,
            String narrator,
            String isbn,
            String genre,
            java.time.LocalDate publishDate,
            Boolean available,
            int stock) {
        super(title, author, isbn, genre, publishDate, available, stock);
        this.narrator = narrator;
    }

    public String getNarrator() {
        return narrator;
    }

}
