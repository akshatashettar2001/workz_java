package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.PassportVerification;

public class Custom {
	
	PassportVerification passportVerification;
	
	public void setPassportVerification(PassportVerification passportVerification)
	{
		this.passportVerification=passportVerification;
	}
	
	public void verify()
	{
		System.out.println("invoking verify() in Custom");
		this.passportVerification.verify();
	}

}
