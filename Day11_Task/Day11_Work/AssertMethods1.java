package Day11_Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertMethods1 {
	WebDriver driver;
  @Test(priority = 2)
  public void fn1() throws InterruptedException {
	  driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj_rJWC4pCBAxVEc_UHHe29COYQPAgJ");
	  String tital = driver.getTitle();
	  System.out.println(tital);
	  Assert.assertEquals(tital,"Google");
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void webSet() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }

  @Test(priority = -1)
  public void fn2() throws InterruptedException {
	  driver.get("https://www.bing.com/");
	  Thread.sleep(3000);
  }
  
  @Test
  public void fn3() {
	  driver.get("https://www.flipkart.com/");
  }
  @AfterMethod
  public void EndSite(){
	  driver.quit();
  }
}
