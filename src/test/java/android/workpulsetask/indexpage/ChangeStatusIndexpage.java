package android.workpulsetask.indexpage;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChangeStatusIndexpage {

	public void clickonAssignTaskbutton(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on 'Assigne Task' button.");
		
		MobileElement btn_assignTask = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/assign");
		btn_assignTask.click();
		
		TestCommons.addLabel(androidDriver, "Click on 'Assigne Task' button.");
		TestCommons.pause(4);
	}
	
	public void clickonChangeStatus(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on 'Change Status' button.");
		TestCommons.addLabel(androidDriver, "Click on 'Change Status' button.");
		
		MobileElement btn_assignTask = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/changeStatus");
		btn_assignTask.click();
		
		
		
		TestCommons.pause(4);
	}
	
	
	
	public void searchandSelectAssignee(AndroidDriver<MobileElement> androidDriver, String user_emp1_name)
	{
		TestCommons.log("Search and select user: "+user_emp1_name+"");
		TestCommons.addLabel(androidDriver, "Search user: "+user_emp1_name+"");
		MobileElement searchbox = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/search");
		searchbox.sendKeys(user_emp1_name);
		TestCommons.addLabel(androidDriver, "Select user: "+user_emp1_name+"");
		MobileElement assignee = (MobileElement) androidDriver.findElementByXPath("//android.widget.TextView[@text='"+user_emp1_name+"']");	
		assignee.click();
		
		TestCommons.pause(6);
	}
		
	public void selectInProgressStatus(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Select 'In Progress' Status.");
		TestCommons.addLabel(androidDriver, "Select 'In Progress' Status.");
		MobileElement InProgress = androidDriver.findElementByXPath("//*[contains(@text,'In Progress')]");
		InProgress.click();
	}
	
	public void selectClosedStatus(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Select 'Closed' Status.");
		TestCommons.addLabel(androidDriver, "Select 'Closed' Status.");
		MobileElement InProgress = androidDriver.findElementByXPath("//*[contains(@text,'Closed')]");
		InProgress.click();
	}

}
