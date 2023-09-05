package Day11_Work;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	//WebDriver driver;
	  @Test
	  public void f() {
		  //driver = new ChromeDriver();
		  System.out.println("f1");
	  }
	  @Test
	  public void f1() {
		  //driver = new ChromeDriver();
		  System.out.println("f1");
	  }
	  @BeforeSuite
	  public void a1() {
		  System.out.println("A2B");
	  }
	  @AfterSuite
	  public void a() {
		  System.out.println("A2");
	  }
}
