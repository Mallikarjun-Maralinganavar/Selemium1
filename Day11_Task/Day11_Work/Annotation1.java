package Day11_Work;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation1 {
	//WebDriver driver;
  @Test
  public void f() {
	 // driver = new ChromeDriver();
	  System.out.println("f");
  }
  
//  @Test
//  public void f2() {
//	  driver = new ChromeDriver();
//	  System.out.println("f2");
//  }
//  @BeforeTest
//  public void beforeMethod() {
//	  WebDriverManager.chromedriver().setup();
//	  System.out.println("2");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  driver.quit();
//	  System.out.println("hello");
//  }
  
  @BeforeSuite
  public void af() {
	  System.out.println("A1");
  }
}
