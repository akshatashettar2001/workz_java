package com.poly.app;

public class TicketName extends Ticket {

	@Override
	public void price() {
		System.out.println("invoking price in TicketName...");
		super.price();
	}
}
