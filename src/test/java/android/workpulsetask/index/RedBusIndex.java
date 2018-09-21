package android.workpulsetask.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import android.workpulsetask.init.AppiumInit;
import android.workpulsetask.init.TestCommons;
import android.workpulsetask.init.TestLogger;
import android.workpulsetask.indexpage.NotepadIndexPage;
import android.workpulsetask.indexpage.RedBusIndexpage;
import android.workpulsetask.verification.NotepadVerification;

public class RedBusIndex extends AppiumInit {

	@Test
	public void SignupwithRedBus() throws Exception
	{
		int step = 1;
		//NotepadIndexPage.clickonlogo(androidDriver);
		TestCommons.log("Step "+(step++)+": .Choose The Language ");
		RedBusIndexpage.chosethelanguage(androidDriver);
		TestCommons.log("Step "+(step++)+ ": .Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		TestCommons.log("Step "+(step++)+ ": .Click on Join ");
		RedBusIndexpage.joinredbus(androidDriver);
		TestCommons.log("Step "+(step++)+ ": .Click on Sign up ");
		RedBusIndexpage.signupredbus(androidDriver);
	}//end of function
	
	

}
