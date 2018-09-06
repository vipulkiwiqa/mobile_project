package android.workpulsetask.indexpage;

import org.openqa.selenium.By;

import android.workpulsetask.init.TestCommons;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class NotepadIndexPage {
	
	static String name;

	public static void Entertextinsearchfield(AndroidDriver<MobileElement> androidDriver) {
		
		TestCommons.log("Enter Text on Search Field");
		
		TestCommons.pause(4);

		MobileElement keyword = androidDriver.findElementById("ru.andrey.notepad:id/editText1");
		
		keyword.sendKeys(name);
		
		TestCommons.pause(3);
		
		//keyword.sendKeys(Keys.ENTER);
		
		//TestCommons.pause(10);
		
		TestCommons.log("Keyword entered in the Search Field");
	}

	public static void Clickonaddnotepadbutton(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.log("Click on the + button");
		
		TestCommons.pause(4);

		MobileElement plusbutton = androidDriver.findElementById("ru.andrey.notepad:id/button1");
		
		plusbutton.click();
		
		TestCommons.pause(5);
		
		TestCommons.log("Clicked on plus button");
		
	}

	public static void Addnewnote(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.log("Click on Note");
		
		TestCommons.pause(4);

		MobileElement Note = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
		
        Note.click();
		
		TestCommons.pause(10);
		
		TestCommons.log("Clicked on Note");
		
		
	}

	public static void EnterdataintheNote(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.log("Enter Note");
		
		TestCommons.pause(4);

		MobileElement Notedata = androidDriver.findElement(By.id("ru.andrey.notepad:id/editText1"));
		
        Notedata.click();
        
        String data = TestCommons.generateRandomChars(50);
        
        Notedata.sendKeys(data);
		
		TestCommons.pause(10);
		
		TestCommons.log("Note Entered");
		
		
	}
	
	

	public static void clickonverticalbarbutton(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.log("Click for home page");
		
		TestCommons.pause(4);

		MobileElement clickforhomepage = androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='More options']"));
		
		clickforhomepage.click();
        
        TestCommons.pause(10);
		
				
	}
		
	
	public static void clickonhome(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
       TestCommons.log("Click Home Menu");
		
		TestCommons.pause(4);

		MobileElement clickforhomepage = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
		
		clickforhomepage.click();
        
        TestCommons.pause(10);
		
	}

	public static void Savethenote(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
		    TestCommons.log("Click on Save the Note");
			
			TestCommons.pause(4);

			MobileElement Notename = androidDriver.findElement(By.id("ru.andrey.notepad:id/imageView3"));
			
	        Notename.click();
	        
	        TestCommons.pause(10);
			
			TestCommons.log("Clicked on save note");	
	}

	public static void enternotename(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
		TestCommons.log("Enter name");
		
		TestCommons.pause(4);

		MobileElement Notename = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"));
		
        Notename.click();
        Notename.clear();
        TestCommons.pause(2);
        String data = TestCommons.generateRandomChars(4);
        name="Demo_"+data;
        Notename.sendKeys(name);
        
        TestCommons.pause(10);
			
	}

	public static void clickonsavebutton(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
		TestCommons.log("Click on Save Button");
		
		TestCommons.pause(4);

		MobileElement Notename = androidDriver.findElement(By.id("android:id/button1"));
		
        Notename.click();
        
        TestCommons.pause(10);
		
	}

	public static void deletethenote(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
       TestCommons.log("Enter Text on Search Field");
		
		TestCommons.pause(4);

		MobileElement keyword = androidDriver.findElementById("ru.andrey.notepad:id/editText1");
		
		keyword.sendKeys(name);
		
		//TestCommons.pause(3);
		
		//keyword.sendKeys(Keys.ENTER);
		
		TestCommons.pause(10);
		
		MobileElement notedel = androidDriver.findElement(By.id("ru.andrey.notepad:id/imageView2"));
		
		if(notedel.isDisplayed())
		{
		TestCommons.log("Found the note");
		notedel.click();
		}
		else
			TestCommons.log("Note not found");
		
       TestCommons.pause(2);
		
		MobileElement ok = androidDriver.findElement(By.id("android:id/button1"));
		ok.click();
		TestCommons.pause(4);
		TestCommons.log("Note Deleted");
					
	}

	public static void clickonoktodelete(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
		
	}

	public static void clickonupdatelogo(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
		TestCommons.pause(4);
		
		MobileElement updatelogo = androidDriver.findElement(By.id("ru.andrey.notepad:id/button3"));
		
		updatelogo.click();
		
	}

	public static void clickonjustonce(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
        TestCommons.pause(4);
		
		MobileElement updatelogo = androidDriver.findElement(By.id("android:id/button_once"));
		
		updatelogo.click();
		
		
	}

	public static void clickonupdatebutton(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.pause(4);
		
		MobileElement updatelogo = androidDriver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
		
		updatelogo.click();
	}

	public static void clickonlogo(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
        TestCommons.pause(4);
		TestCommons.log("Clicked on logo");
		MobileElement logo = androidDriver.findElement(By.id("ru.andrey.notepad:id/button4"));
		
		logo.click();
		
	}

	public static void clickonBackgroundcolor(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		
        TestCommons.pause(4);
		TestCommons.log("Choose the Background color option");
		MobileElement bckcolr = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView"));
		
		bckcolr.click();
		
		/*Point dm = bckcolr.getLocation();
		dm.getX();
		androidDriver.tap
		*/
	}

	public static void movethecolorindicator(AndroidDriver<MobileElement> androidDriver) {
		// TODO Auto-generated method stub
		TestCommons.pause(6);
		TestCommons.log("Set the color Indicator");
		MobileElement indicator = androidDriver.findElement(By.id("ru.andrey.notepad:id/ambilwarna_viewHue"));
		
		
		int leftX = indicator.getLocation().getX();
		int rightX = leftX + indicator.getSize().getWidth();
		int middleX = (rightX + leftX) / 2;
		int upperY = indicator.getLocation().getY();
		int lowerY = upperY + indicator.getSize().getHeight();
		int middleY = (upperY + lowerY) / 2;
		
		int i =TestCommons.getRandomNumber(150);
		
		androidDriver.tap(1, leftX, upperY+i, 3);	
		
		TestCommons.pause(6);
		/*Actions act = new Actions(androidDriver);
		
		act.dragAndDropBy(indicator, 10, 0).build().perform();;
		TestCommons.pause(3);*/
		MobileElement ok = androidDriver.findElement(By.id("android:id/button1"));
		
		ok.click();
		
		TestCommons.pause(10);
		
	}

	

		// TODO Auto-generated method stub	
}//End of Class
