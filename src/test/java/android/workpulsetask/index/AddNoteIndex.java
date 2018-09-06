package android.workpulsetask.index;


import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;

public class AddNoteIndex extends AppiumInit{

	
	@Test
	public void Add_Notes_01() throws Exception
	{
		TestCommons.log("******** Test case ID: Add_Notes_01");
		TestCommons.log("******** Test Objective: To check the functionality of 'Add Notes' option");
		
		
		portalIndexPage.doLogin(androidDriver, user_emp1_name, user_emp1_id, user_emp1_password,user_emp1_accessid);
		
		portalIndexPage.clickOnOpenmenu(androidDriver);
		
		portalIndexPage.clickonfirstTask(androidDriver);
		
		addnoteindexpage.clickonAddnote(androidDriver);
		
		addnoteindexpage.enterNote(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		if(addnoteverification.verifyNoteonDetailScreen(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}
		
		addnoteindexpage.clickonAddnote(androidDriver);
		
		addnoteindexpage.enterNotewithspace(androidDriver);
		
		addnoteindexpage.clickonAdd(androidDriver);
		
		if(addnoteverification.verifynoteaddwithOnlyspace(androidDriver))
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
