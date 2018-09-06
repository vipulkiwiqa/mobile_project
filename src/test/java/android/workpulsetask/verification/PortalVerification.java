package android.workpulsetask.verification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.Command;

import android.workpulsetask.index.PortalIndex;
import android.workpulsetask.indexpage.PortalIndexPage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PortalVerification {

	public boolean verifyTaskAdded(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		List<MobileElement> taskList=androidDriver.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/title']"));
		TestCommons.log("Title from String : "+PortalIndexPage.strTitle);
		TestCommons.log("Title in element: "+taskList.get(0).getText());
		
		return taskList.get(0).getText().contains(PortalIndexPage.strTitle);
	}
	
	public boolean verifyAlertforBlankData(AndroidDriver<MobileElement> androidDriver) {
		MobileElement provideTaskName = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/detail");
	
		TestCommons.log("Verify user should get validation Alert for blank Task Name (e.g. Please provide a valid Task Name.)");
		
		String message = provideTaskName.getText();
		if(message.equalsIgnoreCase("Please provide a valid Task Name."))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean verifyspaceValidation(AndroidDriver<MobileElement> androidDriver) {
		
		MobileElement errorMessage = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/title");
		
		TestCommons.log("Verify user should get error message for Entered space in Title and Description fields.");
		
		String message = errorMessage.getText();
		if(message.equalsIgnoreCase("Error!!"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean verifyOpenTaskCount(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(5);
		TestCommons.log("Verify Open task count is Incremented by 1 after adding new task.");
		
		int beforeopencount = Integer.parseInt(PortalIndex.beforeopencount)+1;
		
		int afetropencount = Integer.parseInt(PortalIndexPage.countOpen);
		TestCommons.log("Open Task Count after increment :"+ afetropencount);
		
		if(beforeopencount==afetropencount)
		{
			return true;
		}else {
			return false;
		}

	}
	
	public boolean verifyAllTaskCount(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify All task count is Incremented by 1 after adding new task.");
		
		int beforeAllcount = Integer.parseInt(PortalIndex.beforeAllcount)+1;
		int afetrAllcount = Integer.parseInt(PortalIndexPage.countAll);
		
		TestCommons.log("All Task Count after increment :"+ afetrAllcount);
		if(beforeAllcount==afetrAllcount)
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifytaskreadstatus(AndroidDriver<MobileElement> androidDriver)
	{	
		TestCommons.pause(5);
		
		TestCommons.log("Verify that newly added task is marked as unread.");
		
		MobileElement unreadicon = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'"+PortalIndexPage.strTitle+"')]/..//*[@resource-id='com.app.workpulse.task:id/icon']");

		if(TestCommons.isElementDisplayed(androidDriver, unreadicon))
		{
			return true;
		}else{
			return false;
		}
			
	}
	
	public boolean verifyenabledbutton(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(5);
		TestCommons.log("Verify that 'Add Note', 'Assign Task' and 'Change Status' buttons are enabled. & 'Pick Up Task' is disabled.");
	
		List<MobileElement> addnotebutton = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		MobileElement Assignbutton = androidDriver.findElementById("com.app.workpulse.task:id/assign");
		MobileElement pickUpTask = androidDriver.findElementById("com.app.workpulse.task:id/pickUp");
		MobileElement ChangeStatus = androidDriver.findElementById("com.app.workpulse.task:id/changeStatus");
		
		Boolean addnote = Boolean.valueOf(addnotebutton.get(addnotebutton.size()-1).getAttribute("enabled"));
		Boolean assign = Boolean.valueOf(Assignbutton.getAttribute("enabled"));
		Boolean pickup = Boolean.valueOf(pickUpTask.getAttribute("enabled"));
		Boolean changeStatus = Boolean.valueOf(ChangeStatus.getAttribute("enabled"));
		
		TestCommons.log("Add Note button isEnabled: "+addnote);
		TestCommons.log("Assign Task button isEnabled: "+assign);
		TestCommons.log("Change Status button isEnabled: "+pickup);
		TestCommons.log("Pick Up Task button isEnabled: "+changeStatus);
		
		if(addnote && assign && !pickup && changeStatus)
		{
			return true;
		}else
		{
			return false;
		}
	}

	public boolean verifyimageUploadOptions(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("When user tap on 'Image(s)' spinner to add image then User should be able to see two options to add image, one Gallery and other from Camera.");
		
		MobileElement cameraroll = androidDriver.findElementById("com.app.workpulse.task:id/gallery");
		MobileElement takePhoto = androidDriver.findElementById("com.app.workpulse.task:id/camera");
		
		if(TestCommons.isElementDisplayed(androidDriver,cameraroll) && TestCommons.isElementDisplayed(androidDriver, takePhoto))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyUsercanAddupto5Images(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that user should able to add maximum 5 image, After that 'Add more image' button should disappear.");
		
		try {
			androidDriver.scrollTo("Add more image");
			
			MobileElement addmorePhotos = androidDriver.findElementById("com.app.workpulse.task:id/addMoreImage");
			
		} catch (Exception e) {
			return true;
		}
			
		return false;
	}
	
	public boolean verifyimageisDeleted(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that image is deleted successfully.");
		
		
		try {
			MobileElement image = androidDriver.findElementById("com.app.workpulse.task:id/icon");
			
		} catch (Exception e) {
			return true;
		}
		return false;
	}
	
	public boolean verifyImageattachedToTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(5);
		TestCommons.log("Selected or added images should be displayed with the created task.");
		MobileElement firstimage = androidDriver.findElementById("com.app.workpulse.task:id/first");
		MobileElement secondimage = androidDriver.findElementById("com.app.workpulse.task:id/second");
		MobileElement thirdimage = androidDriver.findElementById("com.app.workpulse.task:id/third");
		MobileElement fourimage = androidDriver.findElementById("com.app.workpulse.task:id/four");
		MobileElement fiveimage = androidDriver.findElementById("com.app.workpulse.task:id/five");
		
		if(TestCommons.isElementDisplayed(androidDriver,firstimage) && TestCommons.isElementDisplayed(androidDriver,secondimage) 
				&& TestCommons.isElementDisplayed(androidDriver,thirdimage) 
				&& TestCommons.isElementDisplayed(androidDriver,fourimage) && TestCommons.isElementDisplayed(androidDriver,fiveimage))
		{
			return true;
		}else {
			return false;
		}
	}
}
