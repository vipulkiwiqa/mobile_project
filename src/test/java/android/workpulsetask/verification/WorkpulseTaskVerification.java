package android.workpulsetask.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import android.workpulsetask.indexpage.WorkpulseTaskIndexpage;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class WorkpulseTaskVerification {

	public static boolean verifyLogin(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement loginUser=androidWebDriver.findElement(By.xpath(".//form[@id='logoutForm']/../a[contains(text(),'Automation Admin')]"));

		return loginUser.isDisplayed();
	}

	public boolean verifyTaskAdded(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(3);
		TestCommons.log(" Task Name : "+WorkpulseTaskIndexpage.taskName);
		String xpath = ".//div[@class='taskInboxItemsList']//span[contains(text(),'"+WorkpulseTaskIndexpage.taskName+"')]";	
		TestCommons.waitForElementVisible(androidWebDriver, xpath);
		TestCommons.pause(3);
		TestCommons.log("Element Available .. Wait Completed");
		WebElement openState=androidWebDriver.findElement(By.xpath(".//div[@class='taskInboxItemsList']//span[contains(text(),'"+WorkpulseTaskIndexpage.taskName+"')]/../..//*[contains(text(),'Open')]"));
		if(openState.isDisplayed())
			return true;
		return false;
	}

}
