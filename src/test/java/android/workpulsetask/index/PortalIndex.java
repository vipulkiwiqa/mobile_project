package android.workpulsetask.index;


import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.indexpage.PortalIndexPage;
import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class PortalIndex extends AppiumInit{

	
	@Test
	public void Open_Task_02() throws Exception
	{
		TestCommons.log("******** Test case ID: Open_Task_02");
		TestCommons.log("******** Test Objective: To Check the functionality of create Task When Add Task by Task application.");
				
	//	setUp();
		portalIndexPage.doLogin(androidDriver, user_admin_name, user_admin_id, user_admin_password,user_admin_accessid);
		
		portalIndexPage.getOpenCount(androidDriver);
		
		portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocation(androidDriver);

		portalIndexPage.clickAddTask(androidDriver);
	
		portalIndexPage.clickOnOpen(androidDriver);
		
		if(portalVerification.verifyTaskAdded(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
	}
	

	@Test
	public void Open_Task_03() throws Exception
	{
		
		TestCommons.log("******** Test case ID: Open_Task_03");
		TestCommons.log("******** Test Objective: To check the validation at the time of creating task.");
		
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_admin_name, user_admin_id, user_admin_password,user_admin_accessid);
		
		portalIndexPage.getOpenCount(androidDriver);
		
		portalIndexPage.clickOnAddbutton(androidDriver);

		TestCommons.log("Click on Add Task button without filling any data.");
		portalIndexPage.clickAddTask(androidDriver);
		
		if(portalVerification.verifyAlertforBlankData(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		portalIndexPage.clickonOk(androidDriver);
		
		TestCommons.log("Enter only space in task title and description.");
		portalIndexPage.enterTitleWithspace(androidDriver);
		
		portalIndexPage.enterDescriptionwithspace(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocation(androidDriver);
		
		portalIndexPage.clickAddTask(androidDriver);
		
		if(portalVerification.verifyspaceValidation(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
	}
	
	
	@Test
	public void Open_Task_04() throws Exception
	{
		
		TestCommons.log("******** Test case ID: Open_Task_04");
		TestCommons.log("******** Test Objective: To Check the functionality of create Task with adding images.");
		
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_admin_name, user_admin_id, user_admin_password,user_admin_accessid);
				
		portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocation(androidDriver);
		
		portalIndexPage.clickOnAddImageIcon(androidDriver);
		
		if(portalVerification.verifyimageUploadOptions(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		TestCommons.navigateBack(androidDriver);
		portalIndexPage.clickOnAddImageIcon(androidDriver);
		portalIndexPage.clickonCameraRoll(androidDriver);
		
		portalIndexPage.selectoneImagesFromGallary(androidDriver);
		
		portalIndexPage.clickonDeleteButton(androidDriver);
		
		if(portalVerification.verifyimageisDeleted(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		portalIndexPage.clickOnAddImageIcon(androidDriver);
		
		portalIndexPage.clickonCameraRoll(androidDriver);
		
		portalIndexPage.selectImagesFromGallary(androidDriver);
		
		
		if(portalVerification.verifyUsercanAddupto5Images(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		portalIndexPage.clickAddTask(androidDriver);
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonNewlyCreatedTask(androidDriver);
		
		
		if(portalVerification.verifyImageattachedToTask(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		
	}
	
	public static String beforeopencount="";
	public static String beforeAllcount="";
	
	
	@Test
	public void Open_Task_05() throws Exception
	{
		TestCommons.log("******** Test case ID: Open_Task_05");
		TestCommons.log("******** Test Objective: To check the other effects of Open task when Add task by portal or app");
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_admin_name, user_admin_id, user_admin_password,user_admin_accessid);
		
		portalIndexPage.getOpenCount(androidDriver);
		portalIndexPage.getAllCount(androidDriver);
		beforeopencount = PortalIndexPage.countOpen;
		beforeAllcount = PortalIndexPage.countAll;
		
		portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocation(androidDriver);

		portalIndexPage.clickAddTask(androidDriver);
	
		portalIndexPage.getOpenCount(androidDriver);
		portalIndexPage.getAllCount(androidDriver);
		
		if(portalVerification.verifyOpenTaskCount(androidDriver) && portalVerification.verifyAllTaskCount(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		if(portalVerification.verifytaskreadstatus(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void Open_Task_06() throws Exception
	{
		TestCommons.log("******** Test case ID: Open_Task_06");
		TestCommons.log("******** Test Objective: To check the available options for Open task If task is assigned to the User 'Auto 1'.");
		
		//setUp();
		
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		addnoteindexpage.logout(androidDriver);
	
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		/*
		portalIndexPage.getOpenCount(androidDriver);
		portalIndexPage.getAllCount(androidDriver);
		beforeopencount = PortalIndexPage.countOpen;
		beforeAllcount = PortalIndexPage.countAll;*/
		
		/*portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocation(androidDriver);

		portalIndexPage.clickAddTask(androidDriver);*/
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonNewlyCreatedTask(androidDriver);
		
		if(portalVerification.verifyenabledbutton(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
	
	}
	
	public void AssigneTasktouser(String user_emp1_name)
	{
		TestCommons.log("Executing test Pre- Requisite: Task assign to the 'Auto 1' user.");
		
		//setUp();
		 portalIndexPage = new PortalIndexPage();
		
		portalIndexPage.doLogin(androidDriver, user_admin_name, user_admin_id, user_admin_password,user_admin_accessid);
			
		portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocationHillsideDonuts(androidDriver);

		portalIndexPage.clickAddTask(androidDriver);
	
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonNewlyCreatedTask(androidDriver);
		
		changeStatusIndexpage.clickonAssignTaskbutton(androidDriver);
		
		changeStatusIndexpage.searchandSelectAssignee(androidDriver,user_emp1_name);
	
		TestCommons.log("Task "+PortalIndexPage.strTitle+ " is successfully assigned to 'Auto 1' user");
	}
		
}
	
