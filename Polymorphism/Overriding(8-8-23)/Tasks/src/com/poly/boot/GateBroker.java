package com.poly.boot;

import com.poly.app.Gate;
import com.poly.app.GateLock;

public class GateBroker {

	public static void main(String[] args) {
		
		Gate gate=new GateLock();
		gate.key();
	}
}
