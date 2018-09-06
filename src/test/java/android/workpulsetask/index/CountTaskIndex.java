package android.workpulsetask.index;



import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class CountTaskIndex extends AppiumInit{
	
	@Test
	public void Count_Task_01() throws Exception
	{
		TestCommons.log("******** Test case ID: Count_Task_01");
		TestCommons.log("******** Test Objective: To check the available open, InProgress and Closed task and their count on Open status, Inprogress status and Closed status respectively.");
		
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		countIndexPage.getTasksCountonTaskscreen(androidDriver);
	
		countIndexPage.clickonOpenTask(androidDriver);
		
		if(countVerification.verifyTaskcount(androidDriver, "Open"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		TestCommons.log("Navigate back.");
		TestCommons.navigateBack(androidDriver);
		
		countIndexPage.clickonInprogressTask(androidDriver);
		
		if(countVerification.verifyTaskcount(androidDriver, "In Progress"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		TestCommons.log("Navigate back.");
		TestCommons.navigateBack(androidDriver);
		
		countIndexPage.clickonClosedTask(androidDriver);
		
		if(countVerification.verifyTaskcount(androidDriver, "Closed"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void Count_Unread_01() throws Exception
	{
		TestCommons.log("******** Test case ID: Count_Unread_01");
		TestCommons.log("******** Test Objective: To check the unread count of Open, Inprogress and closed case task on Tasks screen.");
		
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		countIndexPage.getUnreadTasksCountonTaskscreen(androidDriver);
	
		countIndexPage.clickonOpenTask(androidDriver);
		
		if(countVerification.verifyUnreadTaskcount(androidDriver, "Open"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		TestCommons.log("Navigate back.");
		TestCommons.navigateBack(androidDriver);
		
		countIndexPage.clickonInprogressTask(androidDriver);
		
		if(countVerification.verifyUnreadTaskcount(androidDriver, "In Progress"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		TestCommons.log("Navigate back.");
		TestCommons.navigateBack(androidDriver);
		
		countIndexPage.clickonClosedTask(androidDriver);
		
		if(countVerification.verifyUnreadTaskcount(androidDriver, "Closed"))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		} else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
	}
	

}
