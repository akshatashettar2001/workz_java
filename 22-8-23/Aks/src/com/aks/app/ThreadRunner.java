package com.aks.app;

public class ThreadRunner {
public static void main(String[] args) {
	
	Thread thread = Thread.currentThread();

	System.out.println("Thread Name: " + thread.getName());
	System.out.println("Thread ID: " + thread.getId());
	System.out.println("Thread Priority: " + thread.getPriority());
	System.out.println("Is Daemon Thread: " +thread.isDaemon());
	System.out.println("Thread State"+thread.getState());
	
	
}
}
