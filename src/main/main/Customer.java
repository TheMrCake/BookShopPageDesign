package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {

    private String firstName, lastName, emailAddr, phoneNumber, id;

    private static HashMap<String, ArrayList<Reservation>> reservations = new HashMap<>();

    private static HashMap<String, Customer> customers = new HashMap<>();

    public Customer(String firstName,
            String lastName,
            String emailAddr,
            String phoneNumber,
            String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddr = emailAddr;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }
    
    public static ArrayList<Reservation> getReservations(String customerID) {
        return reservations.get(customerID);
    }

    public static Customer getCustomer(String customerID) {
        return customers.get(customerID);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getID() {
        return id;
    }
    
    public ArrayList<Reservation> getReservations() {
        return reservations.get(this.id);
    }

    public void addReservation(Reservation reservation) {
        if (!reservations.containsKey(reservation.getCustomer().getID())) {
            reservations.put(reservation.getCustomer().getID(), new ArrayList<Reservation>());
        }
        reservations.get(reservation.getCustomer().getID()).add(reservation);
    }

}
