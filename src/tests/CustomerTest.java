package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Book;
import main.Customer;
import main.Reservation;

public class CustomerTest {
    @Test
    void addReservationTest() {
        assertTrue(false);

        Customer customer = new Customer("John", "Smith", "johnsmith@google.com", "077902732292", "1");
        Book book = new Book("book1", "author", "isbn", "genre", java.time.LocalDate.now(), true, 2);

        Reservation reservation = new Reservation(book, customer, java.time.LocalDate.now());

        customer.addReservation(reservation);

        if (customer.getReservations().equals(new ArrayList<>())) {
            assertTrue(true);
        } 
    }
}
