package android.workpulsetask.verification;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import android.workpulsetask.indexpage.AddNoteIndexpage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChangeStatusVerification {
	
	
	
	
	public boolean verifyStatusChangeScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that 'Change Status' screen should be opned.");
		
		MobileElement changestatus = (MobileElement) androidDriver.findElementByXPath("//android.widget.TextView[@text='Change Status']");
		
		if(TestCommons.isElementDisplayed(androidDriver, changestatus))
		{
			return true;
		}else {
			return false;
		}
	}
	

	public boolean verifyopenIsChecked(AndroidDriver<MobileElement> androidDriver)
	{
		
		TestCommons.log("Verify that 'Open' status should be selected by default.");
		
		MobileElement openstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'Open')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
		
		if(TestCommons.isElementDisplayed(androidDriver, openstatus))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyInProgressIsChecked(AndroidDriver<MobileElement> androidDriver)
	{
		
		TestCommons.log("Verify that 'In Progress' status should be selected by default.");
		
		MobileElement inProgressstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'In Progress')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
		
		if(TestCommons.isElementDisplayed(androidDriver, inProgressstatus))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyClosedIsChecked(AndroidDriver<MobileElement> androidDriver)
	{
		
		TestCommons.log("Verify that 'Closed' status should be selected by default.");
		
		MobileElement closestatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'Closed')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
		
		if(TestCommons.isElementDisplayed(androidDriver, closestatus))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyotherstatusIsunChecked(AndroidDriver<MobileElement> androidDriver)
	{	
		TestCommons.log("Verify that 'In Progress' and 'Closed' status should be un checked.");
		
		try {
			MobileElement inProgressstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'In Progress')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			
		} catch (Exception e) {

			try {
				MobileElement Closedstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'In Progress')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			} catch (Exception e2) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean verifyOpenClosedtatusIsunChecked(AndroidDriver<MobileElement> androidDriver)
	{	
		TestCommons.log("Verify that 'Open' and 'Closed' status should be un checked.");
		
		try {
			MobileElement openstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'Open')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			
		} catch (Exception e) {

			try {
				MobileElement Closedstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'Closed')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			} catch (Exception e2) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean verifyOpenInProgresstatusIsunChecked(AndroidDriver<MobileElement> androidDriver)
	{	
		TestCommons.log("Verify that 'Open' and 'In Progress' status should be un checked.");
		
		try {
			MobileElement openstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'Open')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			
		} catch (Exception e) {

			try {
				MobileElement InProgressstatus = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'In Progress')]/../*[@resource-id='com.app.workpulse.task:id/radioButton']");
			} catch (Exception e2) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean verifyaddNoteScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that user should be redirected to 'Add Note' screen.");
		
		MobileElement TitleNote = androidDriver.findElementByXPath("//android.widget.TextView[@text='Notes']");

		if(TestCommons.isElementDisplayed(androidDriver, TitleNote))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	
	
	public boolean verifystatusIsChangedtoInProgress(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(4);
		
		TestCommons.log("Verify that task status should be change from 'Open' to 'In Progress'.");
		
		MobileElement TitleNote = androidDriver.findElementByXPath("//android.widget.Button[@text='In Progress']");

		if(TestCommons.isElementDisplayed(androidDriver, TitleNote))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	
	public boolean verifystatusIsChangedtoClosed(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(4);
		
		TestCommons.log("Verify that task status should be change from 'In Progress' to 'Closed'.");
		
		MobileElement TitleNote = androidDriver.findElementByXPath("//android.widget.Button[@text='Closed']");

		if(TestCommons.isElementDisplayed(androidDriver, TitleNote))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean verifystatusIsChangedtoOpen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(4);
		
		TestCommons.log("Verify that task status should be change from 'Open' to 'In Progress'.");
		
		MobileElement TitleNote = androidDriver.findElementByXPath("//android.widget.Button[@text='In Progress']");

		if(TestCommons.isElementDisplayed(androidDriver, TitleNote))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean verifyTaskstatusonDetailScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that changed status and added note should be displayed on Task detail screen.");
		
		List<MobileElement> details = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		
		String statusDetail = details.get(0).getText();
		
		TestCommons.log("Status change details on Task detail page : "+ statusDetail);
		
		if(statusDetail.contains("Changed status from Open to In Progress.") && statusDetail.contains(AddNoteIndexpage.noteText))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean verifyTaskstatusonClosedTaskDetailScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that changed status and added note should be displayed on Task detail screen.");
		
		List<MobileElement> details = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		
		String statusDetail = details.get(0).getText();
		
		TestCommons.log("Status change details on Task detail page : "+ statusDetail);
		
		if(statusDetail.contains("Changed status from In Progress to Closed.") && statusDetail.contains(AddNoteIndexpage.noteText))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean verifyTaskstatusonInProgressTaskDetailScreen(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify that changed status and added note should be displayed on Task detail screen.");
		
		List<MobileElement> details = androidDriver.findElementsById("com.app.workpulse.task:id/note");
		
		String statusDetail = details.get(0).getText();
		
		TestCommons.log("Status change details on Task detail page: "+ statusDetail);
		
		if(statusDetail.contains("Changed status from Closed to In Progress.") && statusDetail.contains(AddNoteIndexpage.noteText))
		{
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean verifyDateTimeofStatusChange(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Verify Date of status changed.");
		
		List<MobileElement> dateTime = androidDriver.findElementsById("com.app.workpulse.task:id/nameDateTime");
		
		String statusDetail = dateTime.get(0).getText();
		
		TestCommons.log("Note added Date Time: "+ AddNoteIndexpage.addNoteDateTime);
		TestCommons.log("Date and Time on status detail screen: "+ statusDetail);
		
		if(statusDetail.contains(AddNoteIndexpage.addNoteDateTime))
		{
			return true;
		}else {
			return false;
		}
	}
	
}
