package Day7_Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.sort_order&order=ASC");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Select s = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
//		List<WebElement> ls1= s.getOptions();
//		List<String> ls1new = new ArrayList<String>();
//		
////		for(int i=0 ;i<ls1.size();i++) {
////			ls1new.add(ls1.get(i).getText());
////		}
//		
//		for (WebElement web : ls1) {
//			ls1new.add(web.getText());
//		}
//		
//		//Selecting by Index Ls1 List we Created
//		//s.selectByIndex(2);
//		//s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=DESC");
//		s.selectByVisibleText("Model (A - Z)");
//		
//		Thread.sleep(10000);
//		
//		s.selectByIndex(3);
//		/*Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
//		at org.openqa.selenium.support.ui.Select.deselectByVisibleText(Select.java:272)
//		
//		Thread.sleep(3000);
//		
//		s.deselectByVisibleText("Model (A - Z)");
//		
//		*/
//		Collections.sort(ls1new);
//		for (String string : ls1new) {
//			
//			System.out.println(string);
//		}
		
		//multi-select..........................
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select s = new Select(driver.findElement(By.xpath("//select[@name='selenium_commands']")));		
		s.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		s.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		s.deselectByIndex(1);
		List<WebElement> ls = s.getAllSelectedOptions();
		
		for (WebElement webElement : ls) {
			System.out.println(webElement.getText());
		}
		
		//driver.quit();
		
	}

}
