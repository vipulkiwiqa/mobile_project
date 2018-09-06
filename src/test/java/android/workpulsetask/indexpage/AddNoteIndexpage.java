package android.workpulsetask.indexpage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddNoteIndexpage {
	
	public static String noteText="";
	
	public void clickonAddnote(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.addLabel(androidDriver, "Click on 'Add Note' button.");

		List<MobileElement> addnote = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		
		addnote.get(addnote.size()-1).click();
		
		TestCommons.log("Click on 'Add Note' button.");
	}

	public void enterNote(AndroidDriver<MobileElement> androidDriver)
	{
		MobileElement txt_note = androidDriver.findElementById("com.app.workpulse.task:id/note");
		noteText = "Note_"+TestCommons.generateRandomChars(10);
		
		TestCommons.log("Enter Note: "+noteText);
		TestCommons.addLabel(androidDriver, "Enter Note: "+noteText);
		txt_note.sendKeys(noteText);
	}
	
	public static String addNoteDateTime="";
	
	public void clickonAdd(AndroidDriver<MobileElement> androidDriver)
	{ 
		TestCommons.log("Click on add button.");
		TestCommons.addLabel(androidDriver, "Click on add button.");
		MobileElement btn_add = androidDriver.findElementById("com.app.workpulse.task:id/send");
		
		btn_add.click();
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new  SimpleDateFormat("MM/dd/yyyy hh:mm a");
	
		addNoteDateTime = sdf.format(date);
	}
	
	public void enterNotewithspace(AndroidDriver<MobileElement> androidDriver)
	{
		MobileElement txt_note = androidDriver.findElementById("com.app.workpulse.task:id/note");
		noteText = "                ";
		
		TestCommons.addLabel(androidDriver, "Enter Note with space only.");
		
		TestCommons.log("Enter Note with space only.");
		
		txt_note.sendKeys(noteText);
	}
	
	public void logout(AndroidDriver<MobileElement> androidDriver)
	{
		
		List<MobileElement> settings = androidDriver.findElementsById("com.app.workpulse.task:id/right");
		settings.get(0).click();
		TestCommons.pause(3);
		TestCommons.addLabel(androidDriver, "Click on Settings.");
		
		MobileElement logOut = androidDriver.findElementByXPath("//android.widget.TextView[@text='Logout']");
		logOut.click();
		TestCommons.pause(3);
		TestCommons.addLabel(androidDriver, "Click on Logout.");
		
	}
}
