package android.workpulsetask.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import android.workpulsetask.indexpage.NotepadIndexPage;
import android.workpulsetask.verification.NotepadVerification;

public class NotepadIndex extends AppiumInit{
	
	@Test
	public void createthenote() throws Exception
	{
		TestCommons.log("******** Test case ID: Add_Notes_01");
		TestCommons.log("******** Test Objective: To check the functionality of 'Add Notes' option");
		
		
	  //  NotepadIndexPage.Entertextinsearchfield(androidDriver);
		
		NotepadIndexPage.Clickonaddnotepadbutton(androidDriver);
		
		NotepadIndexPage.Addnewnote(androidDriver);
		
		NotepadIndexPage.EnterdataintheNote(androidDriver);
		
		
		NotepadIndexPage.clickonverticalbarbutton(androidDriver);
		
		NotepadIndexPage.clickonhome(androidDriver);
		
        NotepadIndexPage.Savethenote(androidDriver);
		
		NotepadIndexPage.enternotename(androidDriver);
		
		NotepadIndexPage.clickonsavebutton(androidDriver);
		
		//NotepadIndexPage.Entertextinsearchfield(androidDriver);
		
		NotepadIndexPage.deletethenote(androidDriver);
		
		//NotepadIndexPage.clickonoktodelete(androidDriver);
		
		
		
		
		//addnoteverification.verifynoteaddwithOnlyspace(androidDriver)
		/*
		if(NotepadVerification.verifysearchkeyword(androidDriver))
		{
			TestCommons.log("------------------Test Passed---------------------");
			Assert.assertTrue(true);
		}
		else
		{
			TestCommons.log("------------------Test Failed---------------------");
			Assert.assertTrue(false);
		}*/
		
	}//end of function
	
	@Test
	public void updatetheapp() throws Exception
	{
		
        NotepadIndexPage.clickonupdatelogo(androidDriver);
        
        NotepadIndexPage.clickonjustonce(androidDriver);
        
        NotepadIndexPage.clickonupdatebutton(androidDriver);
		
		
	}//end of function
	
	

	@Test
	public void changebackgroundcolor() throws Exception
	{
		
		NotepadIndexPage.clickonlogo(androidDriver);
		NotepadIndexPage.clickonBackgroundcolor(androidDriver);
		NotepadIndexPage.movethecolorindicator(androidDriver);
	}//end of function

}//end of class
