package com.poly.boot;

import com.poly.app.Ticket;
import com.poly.app.TicketName;

public class TicketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in TicketRunner...");
		Ticket ticket = new TicketName();
		ticket.price();
	}
}
