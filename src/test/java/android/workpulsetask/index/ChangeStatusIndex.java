package android.workpulsetask.index;



import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.indexpage.PortalIndexPage;
import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;

public class ChangeStatusIndex extends AppiumInit{
	

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

	@Test
	public void Change_Status_01() throws Exception
	{
		TestCommons.log("******** Test case ID: Change_Status_01");
		TestCommons.log("******** Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at Open status..");
		
		//setUp();
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		addnoteindexpage.logout(androidDriver);
		
		TestCommons.log("Test case ID: Change_Status_01");
		TestCommons.log("Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at Open status.");
		
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.getOpenCount(androidDriver);
	
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		if(changeStatusVerification.verifyStatusChangeScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Change Status' screen should be opned.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Change Status' screen should be opned.");
		}
		
		if(changeStatusVerification.verifyopenIsChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Open' status should be selected by default.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Open' status should be selected by default.");
		}
		
		if(changeStatusVerification.verifyotherstatusIsunChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'In Progress' and 'Closed' status should be un checked.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'In Progress' and 'Closed' status should be un checked.");
		}
		
		changeStatusIndexpage.selectInProgressStatus(androidDriver);
		
		if(changeStatusVerification.verifyaddNoteScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that user should be redirected to 'Add Note' screen.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that user should be redirected to 'Add Note' screen.");
		}
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		if(changeStatusVerification.verifystatusIsChangedtoInProgress(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that task status should be change from 'Open' to 'In Progress'.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that task status should be change from 'Open' to 'In Progress'.");
		}
		
		if(changeStatusVerification.verifyTaskstatusonDetailScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Changed status from Open to In Progress.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			
			Assert.assertTrue(false, "Changed status from Open to In Progress.");
		}
		
		
		if(changeStatusVerification.verifyDateTimeofStatusChange(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify Date of status changed.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify Date of status changed.");
		}
	}
	
	
	@Test
	public void Change_Status_02() throws Exception
	{
		TestCommons.log("******** Test case ID: Change_Status_02");
		TestCommons.log("******** Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at InProgress status.");
		
		//setUp();
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.pause(3);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(7);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(7);
		addnoteindexpage.logout(androidDriver);
		
		TestCommons.log("Test case ID: Change_Status_02");
		TestCommons.log("Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at InProgress status.");
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		///
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		changeStatusIndexpage.selectInProgressStatus(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
		///
		
		portalIndexPage.clickOnInProgressmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		if(changeStatusVerification.verifyStatusChangeScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Change Status' screen should be opned.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Change Status' screen should be opned.");
		}
		
		if(changeStatusVerification.verifyInProgressIsChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'In Progress' status should be selected by default.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'In Progress' status should be selected by default.");
		}
		
		if(changeStatusVerification.verifyOpenClosedtatusIsunChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Open' and 'Closed' status should be un checked.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Open' and 'Closed' status should be un checked.");
		}
		
		changeStatusIndexpage.selectClosedStatus(androidDriver);
		
		if(changeStatusVerification.verifyaddNoteScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that user should be redirected to 'Add Note' screen.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that user should be redirected to 'Add Note' screen.");
		}
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		if(changeStatusVerification.verifystatusIsChangedtoClosed(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that task status should be change from 'In Progress' to 'Closed'.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that task status should be change from 'In Progress' to 'Closed'.");
		}
		
		if(changeStatusVerification.verifyTaskstatusonClosedTaskDetailScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that changed status and added note should be displayed on Task detail screen.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that changed status and added note should be displayed on Task detail screen.");
		}
		
		
		if(changeStatusVerification.verifyDateTimeofStatusChange(androidDriver))
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
	public void Change_Status_03() throws Exception
	{
		TestCommons.log("******** Test case ID: Change_Status_03");
		TestCommons.log("******** Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at Closed status.");
				
		//setUp();
		AssigneTasktouser(user_emp1_name);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(5);
		addnoteindexpage.logout(androidDriver);
		
		TestCommons.log("Test case ID: Change_Status_03");
		TestCommons.log("Test Objective: To Check the 'Change Status' functionality If User 'Auto 1' is at Closed status.");
		
		//setUp();
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		//
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		changeStatusIndexpage.selectClosedStatus(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		TestCommons.navigateBack(androidDriver);
		TestCommons.pause(6);
		TestCommons.navigateBack(androidDriver);
		
		//
		
		portalIndexPage.clickOnClosedmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		changeStatusIndexpage.clickonChangeStatus(androidDriver);
		
		if(changeStatusVerification.verifyStatusChangeScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Change Status' screen should be opned.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Change Status' screen should be opned.");
		}
		
		if(changeStatusVerification.verifyClosedIsChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Closed' status should be selected by default.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Closed' status should be selected by default.");
		}
		
		if(changeStatusVerification.verifyOpenInProgresstatusIsunChecked(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that 'Open' and 'In Progress' status should be un checked.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that 'Open' and 'In Progress' status should be un checked.");
		}
		
		changeStatusIndexpage.selectInProgressStatus(androidDriver);
		
		if(changeStatusVerification.verifyaddNoteScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that user should be redirected to 'Add Note' screen.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that user should be redirected to 'Add Note' screen.");
		}
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		if(changeStatusVerification.verifystatusIsChangedtoInProgress(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that task status should be change from 'Open' to 'In Progress'.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that task status should be change from 'Open' to 'In Progress'.");
		}
		
		if(changeStatusVerification.verifyTaskstatusonInProgressTaskDetailScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify that changed status and added note should be displayed on Task detail screen.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify that changed status and added note should be displayed on Task detail screen.");
		}
		
		
		if(changeStatusVerification.verifyDateTimeofStatusChange(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true,"Verify Date of status changed.");
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false,"Verify Date of status changed.");
		}
	}
}
