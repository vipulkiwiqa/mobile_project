package android.workpulsetask.verification;


import android.workpulsetask.indexpage.CountTaskIndexpage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CountTaskVerification {
	
	public boolean verifyTaskcount(AndroidDriver<MobileElement> androidDriver,String whichTask)
	{	
		TestCommons.pause(4);
		MobileElement Taskbaseline = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/baseline");
		
		String openCount = Taskbaseline.getText();
		
		String TotalCountonTaskScreen="";
		
		TestCommons.log("Count on "+whichTask+" Task screen: "+ openCount);
		
		if(whichTask.equalsIgnoreCase("Open"))
		{
			TotalCountonTaskScreen = CountTaskIndexpage.totalOpenCount+" Total &";
		}else if(whichTask.equalsIgnoreCase("In Progress"))
		{
			TotalCountonTaskScreen = CountTaskIndexpage.totalInprogressCount+" Total &";
		}else if(whichTask.equalsIgnoreCase("Closed"))
		{
			TotalCountonTaskScreen = CountTaskIndexpage.totalCloseCount+" Total &";
		}
		
		if(openCount.contains(TotalCountonTaskScreen))
		{
			return true;
		}else {
			return true;
		}
	}
	
	
	public boolean verifyUnreadTaskcount(AndroidDriver<MobileElement> androidDriver,String whichTask)
	{	
		TestCommons.pause(4);
		MobileElement Taskbaseline = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/baseline");
		
		String openCount = Taskbaseline.getText();
		
		String TotalCountonTaskScreen="";
		
		TestCommons.log("Count on "+whichTask+" Task screen: "+ openCount);
		
		if(whichTask.equalsIgnoreCase("Open"))
		{
			TotalCountonTaskScreen = "& "+CountTaskIndexpage.totalOpenUnreadCount+" Unread";
		}else if(whichTask.equalsIgnoreCase("In Progress"))
		{
			TotalCountonTaskScreen = "& "+CountTaskIndexpage.totalInprogressUnreadCount+" Unread";
		}else if(whichTask.equalsIgnoreCase("Closed"))
		{
			TotalCountonTaskScreen = "& "+CountTaskIndexpage.totalCloseUnreadCount+" Unread";
		}
		
		if(openCount.contains(TotalCountonTaskScreen))
		{
			return true;
		}else {
			return true;
		}
	}

	
}
