package android.workpulsetask.verification;

import java.util.List;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AvailableOptionsVerification {

	
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
	
	public boolean verifyAddNoteChageStatuseButton(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(5);
		TestCommons.log("Verify that 'Add Note' and 'Change Status' buttons are enabled. & 'Assign Task' and 'Pick Up Task' is disabled.");
	
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
		
		if(addnote && !assign && !pickup && changeStatus)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public boolean verifyAddNoteButton(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.pause(5);
		TestCommons.log("Verify that 'Add Note' button is enabled. & 'Assign Task', 'Pick Up Task' and 'Change Status' is disabled.");
	
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
		
		if(addnote && !assign && !pickup && !changeStatus)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
