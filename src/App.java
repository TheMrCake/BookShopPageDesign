public class App {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer("John", "Smith", "johnsmith@google.com", "077902732292", "1");
        Book book = new Book("book1", "author", "isbn", "genre", java.time.LocalDate.now(), true, 2);

        Reservation reservation = new Reservation(book, customer, java.time.LocalDate.now());

        customer.addReservation(reservation);

        for (Reservation foo : Customer.getReservations("1")) {
            System.out.println(foo.getBook().getTitle());
        }

    }
}
