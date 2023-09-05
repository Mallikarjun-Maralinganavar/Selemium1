package Day11_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsonTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
  }
  @Test(dependsOnMethods = {"f"})
  public void f1() throws InterruptedException {
	  driver.findElement(By.name("q1")).sendKeys("Hello",Keys.ENTER);
	  Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods = {"f","f1"})
  public void f2() {
	  driver.quit();
  }
}
