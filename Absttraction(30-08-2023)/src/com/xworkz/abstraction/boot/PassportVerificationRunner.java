package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.implement.Custom;
import com.xworkz.abstraction.app.implement.Security;
import com.xworkz.abstraction.app.rule.PassportVerification;

public class PassportVerificationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PasspassportVerification");
		
		PassportVerification passportVerification=new Security();
		
		Custom custom=new Custom();
		
		custom.setPassportVerification(passportVerification);
		custom.verify();

	}

}
