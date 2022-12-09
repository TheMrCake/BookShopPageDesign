package main;

public class Reservation {

    private Book book;
    private Customer customer;
    private java.time.LocalDate availablityDate;

    public Reservation(Book book, Customer customer, java.time.LocalDate availabilityDate) {
        this.book = book;
        this.customer = customer;
        this.availablityDate = availabilityDate;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public java.time.LocalDate getAvailabilityDate() {
        return availablityDate;
    }
}
