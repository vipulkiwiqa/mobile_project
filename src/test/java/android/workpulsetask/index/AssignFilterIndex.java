package android.workpulsetask.index;



import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class AssignFilterIndex extends AppiumInit{

	@Test
	public void Assign_Task_01()
	{
		TestCommons.log("******** Test case ID: Assign_Task_01");
		TestCommons.log("******** Test Objective: To check the functinoality of Assign task.");
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.clickOnAddbutton(androidDriver);

		portalIndexPage.enterTitle(androidDriver);

		portalIndexPage.enterDescription(androidDriver);
		
		portalIndexPage.clickLocation(androidDriver);
		
		portalIndexPage.selectLocationHillsideDonuts(androidDriver);

		portalIndexPage.clickAddTask(androidDriver);
	
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonNewlyCreatedTask(androidDriver);
		
		changeStatusIndexpage.clickonAssignTaskbutton(androidDriver);
		
		if(assignfilterverification.verifyAssignTaskScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		assignfilterindexpage.searchUser(androidDriver,user_emp2_name);
		
		if(assignfilterverification.verifyAssigntouser(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		assignfilterindexpage.SelectUser(androidDriver,user_emp2_name);
	
		if(assignfilterverification.verifyTaskHistory(androidDriver))
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
}
