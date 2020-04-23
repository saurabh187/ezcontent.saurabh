package ezcontent.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import ezcontent.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PageLoadTimeout = 30;
	public static long ImplicitWait = 10;

	public void navigateToURL(String URL) {
		System.out.println("Navigating to: " + URL);
	}

	// implicit wait
	public void implicitWait() {
	driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
	}
	
	
	// thread wait
	public static void threadWait() throws InterruptedException {		
		Thread.sleep(5000);
	 }
	
	
	// Switch by Index

	public void switchFrameByIndex() {
		driver.switchTo().frame("indexValue");
	}

//Switch by frame name
	public void switchFrameByName() {
		driver.switchTo().frame("frameName");
	}

	// Switch by frame ID
	public void switchFrameById() {
		driver.switchTo().frame("frameId");
	}

//Switch by frame WebElement
	public void switchFrameByWebElement() {
		driver.switchTo().frame("iframeElement");
	}

//Switch back to the main window from iframe
	public void switchBackToWindow() {
		driver.switchTo().defaultContent();
	}

	// switch to simple alert
	public void switchToSimpleAlert() {
	Alert simpleAlert = driver.switchTo().alert();
	 String alertText = simpleAlert.getText();
	 System.out.println("Alert text is " + alertText);
	 simpleAlert.accept();
	 }
	 
     public void clearField(WebElement element) {
         try {
             element.clear();
         } catch (Exception e) {
             System.out.print(String.format("The following element could not be cleared: [%s]", element.getText()));
         }
     }

}
