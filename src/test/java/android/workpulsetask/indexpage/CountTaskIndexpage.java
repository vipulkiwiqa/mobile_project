package android.workpulsetask.indexpage;

import java.util.List;

import org.openqa.selenium.By;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CountTaskIndexpage {
	
	public static String totalOpenCount="";
	public static String totalInprogressCount="";
	public static String totalCloseCount="";
	
	public void getTasksCountonTaskscreen(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(5);
		MobileElement openTask = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/open");
		
		totalOpenCount = openTask.getText();
		TestCommons.log("Total Open Task Count :" + totalOpenCount);
		
		
		MobileElement inProgressTask = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/inProgress");
		
		totalInprogressCount = inProgressTask.getText();
		TestCommons.log("Total In progress Task Count :" + totalInprogressCount);
		
		MobileElement closeTask = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/close");
		
		totalCloseCount = closeTask.getText();
		TestCommons.log("Total Close Task Count :" + totalCloseCount);
		
	}
	
	
	public void clickonOpenTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on Open Task");
		TestCommons.addLabel(androidDriver, "Click on Open Task");
		TestCommons.pause(5);
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		openCount.get(1).click();
		
	}
	
	public void clickonInprogressTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on In Progress Task");
		TestCommons.pause(5);
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		openCount.get(2).click();
	}
	
	public void clickonClosedTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on Closed Task");
		TestCommons.pause(5);
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		openCount.get(3).click();
	}
	
	public static String totalOpenUnreadCount="";
	public static String totalInprogressUnreadCount="";
	public static String totalCloseUnreadCount="";
	
	public void getUnreadTasksCountonTaskscreen(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(5);
		List<MobileElement> unreadCount = androidDriver
				.findElements(By.xpath("//*[@resource-id='com.app.workpulse.task:id/count']"));
		
		totalOpenUnreadCount = unreadCount.get(1).getText();
		TestCommons.log("Total Open unread Task Count :" + totalOpenUnreadCount);
		
		totalInprogressUnreadCount = unreadCount.get(2).getText();
		TestCommons.log("Total In progress unread Task Count :" + totalInprogressUnreadCount);
		
		totalCloseUnreadCount = unreadCount.get(3).getText();
		TestCommons.log("Total Close unread Task Count :" + totalCloseUnreadCount);
		
	}

}
