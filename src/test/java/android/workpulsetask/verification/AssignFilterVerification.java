package android.workpulsetask.verification;

import java.util.List;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AssignFilterVerification {
	
	public boolean verifyAssignTaskScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Veriy that 'Assign case' screen should be opened");
		MobileElement AssignCase = androidDriver.findElementByXPath("//android.widget.TextView[@text='Assign Case']");
		
		if(TestCommons.isElementDisplayed(androidDriver, AssignCase))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyAssigntouser(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Veriy that list of employee having access of 'Task Type' and 'location' should be opened e.g Auto 2");
		
		MobileElement AssignCase = androidDriver.findElementByXPath("//android.widget.TextView[@text='Auto 2']");
		
		if(TestCommons.isElementDisplayed(androidDriver, AssignCase))
		{
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public boolean verifyTaskHistory(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(4);
		TestCommons.log("Task Assigne history should be displayed on task detail screen.");
		
		List<MobileElement> taskHistory = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		System.out.println(taskHistory.get(0).getText());
		if(taskHistory.get(0).getText().matches("Task assigned from (.*) to Auto 2."))
		{
			return true;
		}else {
			return false;
		}
	}

}
