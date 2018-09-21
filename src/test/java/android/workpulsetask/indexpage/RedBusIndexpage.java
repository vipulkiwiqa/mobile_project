package android.workpulsetask.indexpage;
import org.openqa.selenium.By;

import android.workpulsetask.init.TestCommons;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RedBusIndexpage {
	
public static void chosethelanguage(AndroidDriver<MobileElement> androidDriver) {
		
		
        TestCommons.pause(10);
		MobileElement checkbox = androidDriver.findElementByXPath("//*[@text='English']/../android.widget.RadioButton");
        
        //MobileElement checkbox = androidDriver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RadioButton");
        checkbox.click();
		TestCommons.pause(10);
		
		
	}//end of function

public static void Clickoncontinuebutton(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement continuebutton = androidDriver.findElementById("in.redbus.android:id/continueButton");
	continuebutton.click();
	TestCommons.pause(10);
	
}

public static void joinredbus(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement join = androidDriver.findElementById("in.redbus.android:id/login_signup");
	join.click();
	TestCommons.pause(10);	
}


public static void signupredbus(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement join = androidDriver.findElementById("in.redbus.android:id/btnSignUp");
	join.click();
	TestCommons.pause(10);	
}


}
