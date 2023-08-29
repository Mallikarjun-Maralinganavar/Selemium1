package sample.JavaSelenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsHandlingExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//	    driver.get("https://www.browserstack.com");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//
//	    Actions actions = new Actions(driver);
//	    WebElement	element = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1"));
//	    //actions.moveToElement(element).perform();
//	    //actions.contextClick(element).perform();
//	   // actions.doubleClick(element).perform();
	    
	    
//		driver.manage().window().maximize();
//		driver.navigate().to("https://demoqa.com/droppable/");
//		Actions ac =new Actions(driver);
//		
//		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement decs = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
//        jsExe.executeScript("window.scrollBy(0,300)","");
//		//ac.clickAndHold(src).release(decs).build().perform();
//        //ac.dragAndDrop(src, decs).perform();
		
		//Key Bord Keys----------------------
        
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions ac = new Actions(driver);
		
		//WebElement textArea=driver.findElement(By.name("q"));
		ac.keyDown(Keys.SHIFT);
		ac.sendKeys("hello").build().perform();
	        
	}

}
