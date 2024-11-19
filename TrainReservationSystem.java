package com.udemy;

public class TrainReservationSystem {
	public static void main(String[] args) {
		Ticket[] tickets = { new Ticket("12345", "John", "123", "12"), new Ticket("67890", "Jame", "56", "15"),
				new Ticket("11223", "Ghanist", "789", "5C") };

		String searchTicketNumber = "12345";
		boolean found = false;

		for (Ticket ticket : tickets) {
			if (ticket.getTicketNo().equals(searchTicketNumber)) {
				ticket.displayDetails();
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Ticket not found.");
		}
	}
}

class Ticket {
	private String ticket;
	private String name;
	private String seatNo;
	private String trainNo;

	public Ticket(String ticket, String name, String seatNo, String trainNo) {
		this.ticket = ticket;
		this.name = name;
		this.seatNo = seatNo;
		this.trainNo = trainNo;
	}

	public String getTicketNo() {
		return ticket;
	}

	public void displayDetails() {
		System.out.println("Name of passenger: " + name);
		System.out.println("Ticket No.: " + ticket);
		System.out.println("Seat No.: " + seatNo);
		System.out.println("Train No.: " + trainNo);
	}
}

// Answer 1 = As storing Passenger object as pointer make it memory efficient s, making data handling more efficient.
// Pointers allow polymorphic behavior, enabling base class pointers to point to derived class objects.

// Answer 2 = It is work on the concept of array as we use for loop and put it in if- else condition. As when we use getTicketNo() method we get the data about the ticket and in if condition we equalize it with the ticket number we want to search. So through boolean we get the true or false condition that the derised ticket n is availble or not.
// Answer 3 = if we did not use pointer we have to use vector. If we didi't use array we can't be able to easily find the ticket number.