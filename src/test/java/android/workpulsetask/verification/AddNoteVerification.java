package android.workpulsetask.verification;

import java.util.List;


import android.workpulsetask.indexpage.AddNoteIndexpage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddNoteVerification {

	public boolean verifyNoteonDetailScreen(AndroidDriver<MobileElement> androidDriver) {
		
		TestCommons.pause(3);
		
		TestCommons.log("Verify that note is added successfully and reflected on respective Task detail.");
		
		TestCommons.addLabel(androidDriver, "Verify that note is added successfully and reflected on respective Task detail.");
		
		List<MobileElement> notetext = androidDriver.findElementsById("com.app.workpulse.task:id/note");

		String getNotetext = notetext.get(0).getText();

		String addednotetext = AddNoteIndexpage.noteText;

		if (getNotetext.equals(addednotetext)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifynoteaddwithOnlyspace(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(2);
		
		TestCommons.log("Verify that user should get validation message like 'The request is invalid.'");
		
		MobileElement validationMessage = androidDriver.findElementByXPath("//*[@text='The request is invalid.']");
	
		if(TestCommons.isElementDisplayed(androidDriver, validationMessage))
		{
			return true;
		}else {
			return false;
		}
	}
}
