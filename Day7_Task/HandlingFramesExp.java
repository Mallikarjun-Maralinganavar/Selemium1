 /* @author Mallikarjun Maralinagnavar...
 * 
 * @since JDK17 (08/24/2023)....
 * 
 * Dependencies 
 * 1)Selenium-Java      -  4.9.1 ....
 * 2)Webdriver-Manager  -  5.5.2 ....
 * 
 * */

package Day7_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFramesExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame2");
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		
		/*Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#sampleHeading"}
		  (Session info: chrome=116.0.5845.111)	*/	
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
	}

}
