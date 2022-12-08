
public class Comic extends Book {

    private String illustrator;

    public Comic(String title,
            String author,
            String illustrator,
            String isbn,
            String genre,
            java.time.LocalDate publishDate,
            Boolean available,
            int stock) {
        super(title, author, isbn, genre, publishDate, available, stock);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

}
