package com.android.WorkpulseTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	   public static void main(String args[]) {String line = "Click on following link for Login Verification:\r\n" + 
	   		"\r\n" + 
	   		"https://carblip.app.link/nm8M9JWdAP\r\n" + 
	   		"\r\n" + 
	   		"Your Passcode for Carblip login is: 97a1" +  
	   		"If you did not request this, please ignore this email .";
	      String pattern = "is: (.*?)If you";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	      }else {
	         System.out.println("NO MATCH");
	      }
	   }
	}

