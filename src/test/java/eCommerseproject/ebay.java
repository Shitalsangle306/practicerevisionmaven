package eCommerseproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ebay {
  @Test
  public void ebaytest() throws InterruptedException {
	   WebDriver driver = new  ChromeDriver();
	  Reporter.log("opening ebay",true);
	   driver.get("https://www.ebay.com/");
	   Thread.sleep(7000);
	   driver.close(); 
  }
}
