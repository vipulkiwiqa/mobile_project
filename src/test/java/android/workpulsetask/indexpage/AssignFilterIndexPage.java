package android.workpulsetask.indexpage;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AssignFilterIndexPage {

	public void searchUser(AndroidDriver<MobileElement> androidDriver, String user)
	{
		TestCommons.log("Search user: "+user+"");
		
		MobileElement searchbox = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/search");
		searchbox.sendKeys(user);
		TestCommons.addLabel(androidDriver, "Search user: "+user+"");
		TestCommons.pause(2);
	}
	
	public void SelectUser(AndroidDriver<MobileElement> androidDriver, String user)
	{
		TestCommons.log("select user: "+user+"");
		
			MobileElement assignee = (MobileElement) androidDriver.findElementByXPath("//android.widget.TextView[@text='"+user+"']");	
			assignee.click();
			TestCommons.addLabel(androidDriver, "Select user: "+user+"");
		
		TestCommons.pause(6);
	}
	
	
}
