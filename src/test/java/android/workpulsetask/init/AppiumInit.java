package android.workpulsetask.init;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import android.workpulsetask.indexpage.AddNoteIndexpage;
import android.workpulsetask.indexpage.AssignFilterIndexPage;
import android.workpulsetask.indexpage.AvailableOptionsIndexpage;
import android.workpulsetask.indexpage.ChangeStatusIndexpage;
import android.workpulsetask.indexpage.CountTaskIndexpage;
import android.workpulsetask.indexpage.PortalIndexPage;
import android.workpulsetask.indexpage.WorkpulseTaskIndexpage;
import android.workpulsetask.verification.AddNoteVerification;
import android.workpulsetask.verification.AssignFilterVerification;
import android.workpulsetask.verification.AvailableOptionsVerification;
import android.workpulsetask.verification.ChangeStatusVerification;
import android.workpulsetask.verification.CountTaskVerification;
import android.workpulsetask.verification.PortalVerification;
import android.workpulsetask.verification.WorkpulseTaskVerification;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumInit {

	public PortalIndexPage portalIndexPage;
	public PortalVerification portalVerification;
	public CountTaskIndexpage countIndexPage;
	public CountTaskVerification countVerification;
	public AddNoteIndexpage addnoteindexpage;
	public AddNoteVerification addnoteverification;
	public ChangeStatusIndexpage changeStatusIndexpage;
	public ChangeStatusVerification changeStatusVerification;
	public AvailableOptionsIndexpage availOptionIndexpage;
	public AvailableOptionsVerification availOptionVerification;
	public AssignFilterIndexPage assignfilterindexpage;
	public AssignFilterVerification assignfilterverification;
	
	
	public AndroidDriver<MobileElement> androidDriver;
	
	
	public WorkpulseTaskIndexpage workpulseTaskIndexpage;
	public WorkpulseTaskVerification workpulseTaskVerification;
	
	public static String user_admin_name = "Automation Admin";
	public static String user_admin_id = "automation";
	public static String user_admin_password = "123456";
	public static String user_admin_accessid = "1111";

	public static String user_emp1_name = "Auto 1";
	public static String user_emp1_id = "auto_1";
	public static String user_emp1_password = "123456";
	public static String user_emp1_accessid = "1111";

	public static String user_emp2_name = "Auto 2";
	public static String user_emp2_id = "auto_2";
	public static String user_emp2_password = "123456";
	public static String user_emp2_accessid = "1111";

	public static String user_emp3_name = "Auto 3";
	public static String user_emp3_id = "auto_3";
	public static String user_emp3_password = "123456";
	public static String user_emp3_accessid = "1111";
	public static String name="";

	public static boolean isAddLabel = true;
	
	//@Rule
	//public TestWatcher watcher = Factory.createWatcher();
	//@Rule
	//public TestName name = new TestName();

	
	@BeforeMethod(alwaysRun=true)
	public void setUp(Method method)
	{
		name = method.getName();
		
		DesiredCapabilities cap= new DesiredCapabilities();
		URL remote_grid = null ;
		try {
			remote_grid = new URL("http://" + "localhost" + ":" + "4723" + "/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cap=new DesiredCapabilities();
		//File apkFile = new File("app/Notepad.apk");
		//File apkFile = new File("app/Facebook.apk");
		File apkFile = new File("app/redBus Online Bus Ticket Booking Hotel Booking_v6.6.5_apkpure.com.apk");
		
		cap.setCapability("app",apkFile.getAbsolutePath());
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "TA09407DYT");
		/*cap.setCapability("appPackage", "com.app.workpulse.task");
		cap.setCapability("appActivity", "com.workpulse.task.SplashActivity");*/
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", false);//change by vipul
		cap.setCapability("newCommandTimeout", 600);
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("resetKeyboard", true);
		
		//androidDriver = Factory.createAndroidDriver(remote_grid, cap);
		androidDriver = new AndroidDriver<MobileElement>(remote_grid, cap);
		androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		portalIndexPage = new PortalIndexPage();
		portalVerification = new PortalVerification();
		countIndexPage = new CountTaskIndexpage();
		countVerification = new CountTaskVerification();
		addnoteindexpage = new AddNoteIndexpage();
		addnoteverification = new AddNoteVerification();
		changeStatusIndexpage = new ChangeStatusIndexpage();
		changeStatusVerification = new ChangeStatusVerification();
		availOptionIndexpage = new AvailableOptionsIndexpage();
		availOptionVerification = new AvailableOptionsVerification();
		assignfilterindexpage = new AssignFilterIndexPage();
		assignfilterverification = new AssignFilterVerification();
		
		TestCommons.log("--------------------------------------------------------------------------");
		TestCommons.log("------------------- Initiating the Mobile App Session -------------------");
		TestCommons.log("--------------------------------------------------------------------------");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void setUpWebDriver()
//	{
//		DesiredCapabilities browserCaps= null;
//
//		File file = new File("Resources/chromedriver_2_37.exe");	
//		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
//		
//		final ChromeOptions options = new ChromeOptions();
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default_content_settings.popups", 0);
//		//chromePrefs.put("download.default_directory", downloadFilepath);
//		options.setExperimentalOption("prefs", chromePrefs);
//		browserCaps = DesiredCapabilities.chrome();
//		browserCaps.setCapability(ChromeOptions.CAPABILITY, options);
//		options.addArguments("no-sandbox");
//		options.addArguments("--start-maximized");
//		browserCaps.setBrowserName("chrome");
//		browserCaps.setJavascriptEnabled(true);
//	
//		androidWebDriver = new ChromeDriver(browserCaps);
//		androidWebDriver.manage().window().maximize();
//		
//		workpulseTaskIndexpage=new WorkpulseTaskIndexpage();
//		workpulseTaskVerification=new WorkpulseTaskVerification();
//	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown(ITestResult testResult)
	{
		/*if(androidDriver != null)
		{
			//androidDriver.label("Stopping App");
			androidDriver.quit();
			
			TestCommons.log("--------------------------------------------------------------------------");
			TestCommons.log("------------------------- Exiting the Mobile App -------------------------");
			TestCommons.log("--------------------------------------------------------------------------");
		}*/
		

		
		String testName = testResult.getName();
		
		//child.destroy();
		/*CreateLog cl = new CreateLog(appiumDriver);
		cl.writeLog();*/
		//Runtime.getRuntime().exec("taskkill /F /IM adb.exe");
		
		//try {
			
			if (!testResult.isSuccess()) {
				
			
				System.err.println("=====Creating Log=======");
				
				System.err.println("=====Log Completed=======");
				
				/* Print test result to Jenkins Console */
				System.out.println();
				System.out.println("TEST FAILED - " + testName);
				System.out.println();
				System.out.println("ERROR MESSAGE: " + testResult.getThrowable());
				System.out.println("\n");
				Reporter.setCurrentTestResult(testResult);

				/* Make a screenshot for test that failed */
				String screenshotName = TestCommons.getCurrentTimeStampString() + testName;

				System.out.println("========++++++" + TestCommons.getCurrentTimeStampString() + "========++++++++++");
				Reporter.log("<br> <b>Please look to the screenshot - </b>");
				TestCommons.makeScreenshot(androidDriver, screenshotName);
			} else {
				System.out.println("TEST PASSED - " + testName + "\n"); // Print
																		// test
																		// result
																		// to
																		// Jenkins
																		// Console
			}

			// appiumDriver.manage().deleteAllCookies();

			// appiumDriver.resetApp();
			// appiumDriver.closeApp();
			
			androidDriver.quit();

		   		    
		/*} catch (Throwable throwable) {

		}*/

//		if(androidWebDriver != null)
//		{
//			TestCommons.log("Stopping App");
//			androidWebDriver.close();
//			androidWebDriver.quit();
//			
//			TestCommons.log("--------------------------------------------------------------------------");
//			TestCommons.log("------------------------- Exiting Browser -------------------------");
//			TestCommons.log("--------------------------------------------------------------------------");
//		}
	}
}
