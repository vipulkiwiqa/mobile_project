package android.workpulsetask.indexpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;


import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java8.util.Lists;

public class PortalIndexPage {

	public static String currentUserName;
	public static String strTitle, strDesc, countOpen, countAll;

	public void doLogin(AndroidDriver<MobileElement> androidDriver, String user_admin_name,
			String user_admin_id, String user_admin_password, String user_admin_accessid) {
		// TODO Auto-generated method stub
		skipAppIntro(androidDriver);

		clickOnSignIn(androidDriver);

		loginAs(androidDriver, user_admin_name, user_admin_id, user_admin_password, user_admin_accessid);
	}

	public void skipAppIntro(AndroidDriver<MobileElement> androidDriver) {

		try {
			TestCommons.pause(3);
			MobileElement skipButton = androidDriver
					.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/skip']"));

			TestCommons.addLabel(androidDriver, "Click on Skip Button");
			TestCommons.log("Click on Skip Button");
			skipButton.click();
			TestCommons.pause(3);
		} catch (Exception e) {
			System.out.println("Skip button does not found. Click on signIn button.");
		}

	}

	/**
	 * @param androidDriver
	 */
	public void clickOnSignIn(AndroidDriver<MobileElement> androidDriver) {

		TestCommons.pause(3);
		MobileElement signinButton = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/signin']"));
		TestCommons.addLabel(androidDriver, "Click on Sign In Button");
		TestCommons.log("Click on Sign In Button");
		signinButton.click();

	}

	/**
	 * 
	 */
	public void loginAs(AndroidDriver<MobileElement> androidDriver, String user, String userName,
			String password, String accessId) {

		try {

			List<MobileElement> otherButton = androidDriver
					.findElements(By.xpath("//*[@resource-id='com.app.workpulse.task:id/other']"));

			if (otherButton.size() != 0) {

				otherButton.get(0).click();
				TestCommons.addLabel(androidDriver, "Click on Other button");
				TestCommons.log("Click on Other button");

			}

		} catch (Exception e) {

		}

		MobileElement txtUserName = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/userId']"));

		MobileElement txtPassword = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/password']"));

		MobileElement txtAccessKey = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/accessId']"));

		TestCommons.type(androidDriver, txtUserName, userName);
		TestCommons.log("Enter Username : " + userName);
		TestCommons.type(androidDriver, txtPassword, password);
		TestCommons.log("Enter Password : " + password);
		TestCommons.type(androidDriver, txtAccessKey, accessId);
		TestCommons.log("Enter Access ID : " + accessId);

		currentUserName = user;

		MobileElement loginButton = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/loginButton']"));
		TestCommons.addLabel(androidDriver, "Click on Login Button");
		loginButton.click();

		TestCommons.log("Click on Login Button");

		for (int i = 0; i < 45; i++) {
			TestCommons.pause(1);
		}

	}

	/**
	 * @param androidDriver
	 */
	public void clickOnAddbutton(AndroidDriver<MobileElement> androidDriver) {
		TestCommons.pause(8);
		MobileElement addButton = androidDriver
				.findElement(By.xpath("//*[@resource-id='com.app.workpulse.task:id/mainl']/android.widget.Button"));

		int sizex = addButton.getLocation().getX();
		int sizey = addButton.getLocation().getY();

		System.err.println(sizex + " " + sizey);

		TestCommons.pause(1);
		TestCommons.addLabel(androidDriver, "Click on Add icon");
		TestCommons.log("Click on Add icon");
		addButton.click();
		TestCommons.pause(5);
	}

	public void enterTitle(AndroidDriver<MobileElement> androidDriver) {
		strTitle = "Title_" + TestCommons.generateRandomChars(5);
		TestCommons.log(strTitle);
		MobileElement txtTitle = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/title']"));
		TestCommons.type(androidDriver, txtTitle, strTitle);
		TestCommons.addLabel(androidDriver, strTitle);
		TestCommons.log("Title Entered: " + txtTitle.getAttribute("text"));
	}

	public void enterDescription(AndroidDriver<MobileElement> androidDriver) {
		strDesc = "Description_" + TestCommons.generateRandomChars(5);
		TestCommons.log(strDesc);
		MobileElement txtDesc = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/des']"));
		TestCommons.type(androidDriver, txtDesc, strDesc);
		TestCommons.log("Description Entered: " + txtDesc.getAttribute("text"));
	}

	public void clickLocation(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		MobileElement btnLocation = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/locationSpinner']"));
		TestCommons.addLabel(androidDriver, "Click on Location.");
		btnLocation.click();
		TestCommons.pause(2);
	}

	public void selectLocation(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		List<MobileElement> locationList = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/label']"));
		int rnd = TestCommons.randBetween(0, locationList.size() - 1);
		locationList.get(rnd).click();
		TestCommons.pause(2);
	}
	
	public void selectLocationHillsideDonuts(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		MobileElement hillside = androidDriver
				.findElement(By.xpath("//*[contains(@text,'Hillside Donuts')]"));
		
		TestCommons.addLabel(androidDriver, "Click on Hillside Donuts.");
		hillside.click();
		
		TestCommons.pause(2);
	}

	public void clickAddTask(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		MobileElement btnAdd = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/send']"));
		btnAdd.click();
		TestCommons.pause(5);
	}

	public void clickOnOpen(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		TestCommons.log("Open State Count Before:" + countOpen);
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		TestCommons.log("Open State Count After :" + openCount.get(1).getText());
		if (!countOpen.equalsIgnoreCase(openCount.get(1).getText())) {
			TestCommons.log("Open Count does not match.");
		}
		openCount.get(1).click();
		TestCommons.pause(10);
	}

	public void getOpenCount(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		TestCommons.log("Open Task Count :" + openCount.get(1).getText());
		countOpen = openCount.get(1).getText();
	}

	public void getAllCount(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		TestCommons.log("All Task Count :" + openCount.get(1).getText());
		countAll = openCount.get(0).getText();
	}

	public void enterTitleWithspace(AndroidDriver<MobileElement> androidDriver) {
		strTitle = "       ";
		TestCommons.log(strTitle);
		MobileElement txtTitle = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/title']"));
		TestCommons.type(androidDriver, txtTitle, strTitle);
		TestCommons.log("Title Entered: " + txtTitle.getAttribute("text"));
	}

	public void enterDescriptionwithspace(AndroidDriver<MobileElement> androidDriver) {
		strDesc = "       ";
		TestCommons.log(strDesc);
		MobileElement txtDesc = androidDriver
				.findElement(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/des']"));
		TestCommons.type(androidDriver, txtDesc, strDesc);
		TestCommons.log("Description Entered: " + txtDesc.getAttribute("text"));
	}

	public void clickonOk(AndroidDriver<MobileElement> androidDriver) {
		MobileElement btn_ok = (MobileElement) androidDriver.findElementById("com.app.workpulse.task:id/ok");
		btn_ok.click();
	}

	public void clickOnOpenmenu(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub

		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		
		openCount.get(1).click();
		TestCommons.pause(10);
		TestCommons.addLabel(androidDriver, "Click on open menu.");
		TestCommons.log("Click on open menu.");
	}
	
	public void clickOnInProgressmenu(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub

		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		openCount.get(2).click();
		TestCommons.pause(10);
		
		TestCommons.addLabel(androidDriver, "Click on In Progress menu.");
		TestCommons.log("Click on In Progress menu.");
	}
	
	public void clickOnClosedmenu(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(3);
		TestCommons.log("Click on Closed menu.");
		TestCommons.addLabel(androidDriver, "Click on Closed menu.");
		List<MobileElement> openCount = androidDriver
				.findElements(By.xpath(".//*[@resource-id='com.app.workpulse.task:id/count']"));
		openCount.get(3).click();
		TestCommons.pause(10);
		
		
	}
	
	public void clickonNewlyCreatedTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on newly created open task : " + PortalIndexPage.strTitle);
		TestCommons.addLabel(androidDriver, "Click on newly created open task : " + PortalIndexPage.strTitle);
		MobileElement openTask = (MobileElement) androidDriver.findElementByXPath("//*[contains(@text,'"+PortalIndexPage.strTitle+"')]");
	
		openTask.click();
		
		
	}
	
	public void clickonfirstTask(AndroidDriver<MobileElement> androidDriver)
	{
		TestCommons.log("Click on First Task from open Task.");
		TestCommons.pause(5);
		
		TestCommons.addLabel(androidDriver, "Click on First Task from open Task.");

		MobileElement openTask = androidDriver.findElementById("com.app.workpulse.task:id/title");
		
		
		openTask.click();
			
	}
	
	/**
	  * @param androidDriver
	  */
	 public void selectImagesFromGallary(AndroidDriver<MobileElement> androidDriver) {

	  //clickOnCameraIcon(androidDriver);

	  for (int i = 0; i < 5; i++) {

	  
		 
	   TestCommons.pause(2);

	   int x = androidDriver.manage().window().getSize().getWidth();
	   int y = androidDriver.manage().window().getSize().getHeight();

	   androidDriver.tap(1, x / 2, y / 2, 1000);

	   TestCommons.pause(2);

	   androidDriver.tap(1, x / 3, y / 3, 300);

	   TestCommons.pause(5);

	  try {
	    MobileElement acceptImage = androidDriver.findElement(By.xpath("//android.widget.ImageView[2]"));
	    TestCommons.addLabel(androidDriver, "Select Captured Image");
	    TestCommons.log("Select Captured Image.");

	    acceptImage.click();
	   } catch (Exception e) {
	    androidDriver.tap(1, x / 3, y / 3, 300);
	    /*MobileElement acceptImage = androidDriver.findElement(By.xpath("//android.widget.ImageView[2]"));
	    TestCommons.addLabel(androidDriver, "Select Captured image");
	    TestCommons.log("Select Captured Image.");
	    acceptImage.click();*/
	   }

	   if(i!=4)
	   {
		   androidDriver.scrollTo("Add more image");
	   		clickonaddmoreImage(androidDriver);
		  
	   		clickonCameraRoll(androidDriver);
	   }
	   		
	  }
	 
	 }
	 
	 
	 public void selectoneImagesFromGallary(AndroidDriver<MobileElement> androidDriver) {

		  //clickOnCameraIcon(androidDriver);

		 
		   TestCommons.pause(2);

		   int x = androidDriver.manage().window().getSize().getWidth();
		   int y = androidDriver.manage().window().getSize().getHeight();

		   androidDriver.tap(1, x / 2, y / 2, 1000);

		   TestCommons.pause(2);

		   androidDriver.tap(1, x / 3, y / 3, 300);

		   TestCommons.pause(5);

		   try {
		    MobileElement acceptImage = androidDriver.findElement(By.xpath("//android.widget.ImageView[2]"));
		    TestCommons.addLabel(androidDriver, "Select Captured Image");
		    TestCommons.log("Select Captured Image.");

		    acceptImage.click();
		   } catch (Exception e) {
		    androidDriver.tap(1, x / 3, y / 3, 300);
		    MobileElement acceptImage = androidDriver.findElement(By.xpath("//android.widget.ImageView[2]"));
		    TestCommons.addLabel(androidDriver, "Select Captured image");
		    TestCommons.log("Select Captured Image.");
		    acceptImage.click();
		   }

		   		
		 
		 }

	 /**
	  * @param androidDriver
	  */
	 public void clickOnTakePhoto(AndroidDriver<MobileElement> androidDriver) {

	  MobileElement cameraRollbutton = androidDriver
	    .findElementByXPath("com.app.workpulse.task:id/camera");
	  TestCommons.addLabel(androidDriver, "Click on Take Photo.");
	  TestCommons.log("Click on Take Photo.");
	  cameraRollbutton.click();

	 }

	 /**
	  * @param androidDriver
	  */
	 public void clickOnAddImageIcon(AndroidDriver<MobileElement> androidDriver) {

		
	  MobileElement addImageIcon = androidDriver
	    .findElementById("com.app.workpulse.task:id/imageSpinner");
	  TestCommons.addLabel(androidDriver, "Click on 'Image(s)' image spinner.");
	  TestCommons.log("Click on 'Image(s)' image spinner.");
	  addImageIcon.click();

	 }
	 
	 public void clickonCameraRoll(AndroidDriver<MobileElement> androidDriver) {

			
		  MobileElement addImageIcon = androidDriver
		    .findElementById("com.app.workpulse.task:id/gallery");
		  TestCommons.addLabel(androidDriver, "Click on 'Camera Roll'.");
		  TestCommons.log("Click on 'Camera Roll'.");
		  addImageIcon.click();

		 }
	 
	 public void clickonaddmoreImage(AndroidDriver<MobileElement> androidDriver)
	 {
		 MobileElement addImageIcon = androidDriver
		    .findElementById("com.app.workpulse.task:id/addMoreImage");
		  TestCommons.addLabel(androidDriver, "Click on 'Add more Image'.");
		  TestCommons.log("Click on 'Add more Image'.");
		  addImageIcon.click();
	 }
	 
	 public void clickonDeleteButton(AndroidDriver<MobileElement> androidDriver)
	 {
		 androidDriver.scrollTo("Add more image");
		 MobileElement deleteButton = androidDriver
				    .findElementById("com.app.workpulse.task:id/delete");
				  TestCommons.addLabel(androidDriver, "Click on 'Add more Image'.");
				  TestCommons.log("Click on 'Add more Image'.");
				  deleteButton.click();
	 }
	 
	 /**
	  * @param androidDriver
	  */
	/* private void clickOnCameraIcon(AndroidDriver<MobileElement> androidDriver) {

	  MobileElement cameraIcon = androidDriver
	    .findElementByXPath("com.app.workpulse.task:id/gallery");
	  TestCommons.addLabel(androidDriver, "Click on 'Camera roll' icon");
	  TestCommons.log("Click on 'Camera roll' icon.");
	  cameraIcon.click();

	 }

	 public void takePhotofromadb(AndroidDriver<MobileElement> androidDriver)
	 {
		 ArrayList<String> a = new ArrayList<String>();
		 a.add("am");
		 a.add("start");
		 a.add("-a");
		 a.add("android.media.action.IMAGE_CAPTURE");
		 Map<String, Object> args = new HashMap<String, Object>();
		 args.put("command", "echo");
		 args.put("args", a);
		 String output = androidDriver.executeScript("mobile: shell", args);
	 }*/
	
}
