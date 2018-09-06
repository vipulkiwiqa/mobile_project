package android.workpulsetask.indexpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import android.workpulsetask.verification.WorkpulseTaskVerification;

public class WorkpulseTaskIndexpage {

	public static String count,taskName,taskDesc;
	public void webLogin(WebDriver androidWebDriver, String user_admin_id, String user_admin_password, String user_admin_accessid) {
		// TODO Auto-generated method stub
		WebElement txtUserName=androidWebDriver.findElement(By.xpath(".//input[@id='username']"));
		WebElement txtPassword=androidWebDriver.findElement(By.xpath(".//input[@id='password']"));
		WebElement txtAccessId=androidWebDriver.findElement(By.xpath(".//input[@id='accessid']"));
		
		txtUserName.sendKeys(user_admin_id);
		txtPassword.sendKeys(user_admin_password);
		txtAccessId.sendKeys(user_admin_accessid);
		
		
		
		WebElement btnLogin=androidWebDriver.findElement(By.xpath(".//button[@id='loginbtn']"));
		btnLogin.click();
		
		if(WorkpulseTaskVerification.verifyLogin(androidWebDriver))
		{
			TestCommons.log("Test Passed..");
		}
		else
		{
			TestCommons.log("Test Failed..");
		}
	}

	public void clickOnTask(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement btnTask=androidWebDriver.findElement(By.xpath(".//a[contains(@class,'app-task')]"));
		btnTask.click();
		TestCommons.log("Clicked on Task Icon.");
		
	}
	
	public static void openCount(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement openCount=androidWebDriver.findElement(By.xpath(".//div[@id='statusCount']//span[contains(text(),'Open')]/../span[@class='pull-right taskbadge']"));
		count=openCount.getText();
		TestCommons.log("Open Count before : "+openCount.getText());	
	}

	public void clickOnAddTask(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(2);
		WebElement addTask=androidWebDriver.findElement(By.xpath(".//div[@id='statusCount']//div[contains(@class,'addTask')]"));
	//	TestCommons.pause(5);
		addTask=TestCommons.waitForElement(androidWebDriver, addTask);
		addTask.click();
		TestCommons.pause(5);
		TestCommons.log("Clicked on Add task.");
	}

	public void enterTaskName(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement txtTaskName=androidWebDriver.findElement(By.xpath(".//input[@placeholder='Enter your task name' and not(@id)]"));
		taskName = "Task_Automation "+TestCommons.generateRandomChars(10);
		TestCommons.log("Random Task Name :" + taskName);
		txtTaskName.sendKeys(taskName);
		TestCommons.log("Task Name Entered : "+txtTaskName.getAttribute("value"));
	}

	public void enterTaskDescription(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement txtTaskDesc=androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']"));
		taskDesc = "Description_Automation "+TestCommons.generateRandomChars(10);
		TestCommons.log("Random Description :" + taskDesc);
		txtTaskDesc.sendKeys(taskDesc);
		TestCommons.log("Descirpiotn Entered : "+txtTaskDesc.getAttribute("value"));
	}

	public void clickOnSelectTask(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement selecttaskType=androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']/../..//div[@class='selectionBox' and @tabindex='3']"));
		selecttaskType.click();
		TestCommons.pause(2);
		TestCommons.log("Clicked On Select Task Type.");
	}

	public void selectAndRandomTask(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		List<WebElement> taskTypes=androidWebDriver.findElements(By.xpath(".//div[contains(@class,'row filterList ')]//div[@data-dismiss='modal']//label"));
		int random=TestCommons.randBetween(0, (taskTypes.size()-1));
		TestCommons.log("Random Task Type: "+taskTypes.get(random).getText());
		taskTypes.get(random).click();
		TestCommons.pause(2);
		TestCommons.log("Cliked on Random Task Type : "+androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']/../..//div[@class='selectionBox' and @tabindex='3']//span[@class='ellipsis']")).getText());
	}

	public void selectAndRandomLocation(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		List<WebElement> taskLocation=androidWebDriver.findElements(By.xpath(".//input[@placeholder='Search Locations...']/../../..//div[@class='row filterList']//label"));
		int random=TestCommons.randBetween(0, (taskLocation.size()-1));
		TestCommons.log("Random Task Location : "+taskLocation.get(random).getText());
		taskLocation.get(random).click();
		TestCommons.pause(2);
		TestCommons.log("Cliked on Random Task Location: "+androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']/../..//div[@class='selectionBox' and @tabindex='3']//span[@class='ellipsis']")).getText());
	}

	public void clickOnSelectLocaion(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement selecttaskType=androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']/../..//div[@class='selectionBox' and @tabindex='4']"));
		selecttaskType.click();
		TestCommons.pause(2);
		TestCommons.log("Clicked On Select Task Location.");
	}

	public void enterDueDate(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement datePicker=androidWebDriver.findElement(By.xpath(".//textarea[@id='taskDescription']/../../..//input[contains(@class,'datepicker')]"));
		TestCommons.pause(2);
		datePicker.click();
		List<WebElement> dueDate=androidWebDriver.findElements(By.xpath(".//*[contains(@id,'addTaskModal')]//table//div[not (contains(@class,'disabled') )][not (contains(@class,'outfocus') )]"));
		TestCommons.pause(2);
		int random=TestCommons.randBetween(0, dueDate.size()-1);
		TestCommons.log("Clicked on Random Date:" + dueDate.get(random).getAttribute("aria-label"));
		dueDate.get(random).click();
	}

	public void addTask(WebDriver androidWebDriver) {
		// TODO Auto-generated method stub
		WebElement addButton=androidWebDriver.findElement(By.xpath("//textarea[@id='taskDescription']/../../../../..//button[text()='Add ']"));
		count=androidWebDriver.findElement(By.xpath(".//div[@id='statusCount']//span[contains(text(),'Open')]/../span[@class='pull-right taskbadge']")).getText();
		TestCommons.pause(2);
		TestCommons.clickOn(androidWebDriver, addButton);
		TestCommons.log("Click on Add Button to add a task.");
	}


	
}
