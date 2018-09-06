package android.workpulsetask.index;



import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.indexpage.PortalIndexPage;
import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class AvailableOptionsIndex extends AppiumInit{
	
	public static ChangeStatusIndex changeindex = new ChangeStatusIndex();
	
	public void AssigneTasktouser(String user_emp1_name)
	{
		TestCommons.log("Executing test Pre- Requisite: Task assign to the 'Auto 1' user.");
		
		//setUp();
		
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
	
	@Test
	public void InProgress_01()
	{
		
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.log("******** Test case ID: InProgress_01");
		TestCommons.log("******** Test Objective: To check the available options for 'In Progress' task If task is assigned to the User 'Auto 1'");
		
		//setUp();
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
		addnoteindexpage.logout(androidDriver);
		
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		changeStatusIndexpage.selectInProgressStatus(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		TestCommons.navigateBack(androidDriver);
		
		portalIndexPage.clickOnInProgressmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		if(availOptionVerification.verifyenabledbutton(androidDriver))
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
	public void Closed_01()
	{
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.log("******** Test case ID: Closed_01");
		TestCommons.log("******** Test Objective: To check the available options for Closed  task If task is assigned to the User 'Auto 1'");
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
	//	setUp();
		
		addnoteindexpage.logout(androidDriver);
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		changeStatusIndexpage.selectClosedStatus(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
		portalIndexPage.clickOnClosedmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		if(availOptionVerification.verifyAddNoteChageStatuseButton(androidDriver))
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
	public void Closed_02()
	{
		AssigneTasktouser(user_emp2_name);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
	//	setUp();
		
		addnoteindexpage.logout(androidDriver);
		
		TestCommons.log("******** Test case ID: Closed_02");
		TestCommons.log("******** Test Objective: To check the available options for Closed task If task is not assigned to the User 'Auto 1'.");
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp2_name, user_emp2_id, user_emp2_password,user_emp2_accessid);
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		changeStatusIndexpage.selectClosedStatus(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
	//	setUp();
		
		addnoteindexpage.logout(androidDriver);
		
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.clickOnClosedmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		if(availOptionVerification.verifyAddNoteButton(androidDriver))
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
