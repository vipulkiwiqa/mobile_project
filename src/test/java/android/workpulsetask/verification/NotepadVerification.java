package android.workpulsetask.verification;

import java.util.List;


import android.workpulsetask.indexpage.AddNoteIndexpage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NotepadVerification {

	public static boolean verifysearchkeyword(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.log("Check the Keyword into Search Field");
		
		TestCommons.pause(4);

		MobileElement keyword = androidDriver.findElementById("ru.andrey.notepad:id/editText1");
		
		//keyword.sendKeys("This is my first Application");
		
		String match = keyword.getText();
		
		//System.out.println(match);
		TestCommons.log("Keyword into Search Field is :"+match);
		
		if(match.equals("This is my first Application with index"))
			return true;
		else
		    return false;
	}//end of function

}//end of class
