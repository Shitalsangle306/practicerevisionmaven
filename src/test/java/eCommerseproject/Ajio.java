package eCommerseproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajiotest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("ajio opening",false);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
