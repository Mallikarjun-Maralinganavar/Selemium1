package sample.JavaSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.annotation.NoClass;

import net.bytebuddy.asm.Advice.Return;

public class WaitFun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmaralinganavar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		co.setBinary("C:\\Users\\mmaralinganavar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		
		//Implicit
		long strTime = System.currentTimeMillis();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(5000);
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.className("dropbtn")).click();
		long endtime = System.currentTimeMillis();
		//Thread.sleep(3000);
		System.out.println(((endtime-strTime)/1000.0)+" Seconds....");
		driver.switchTo().newWindow(WindowType.TAB);
		try {
		driver.get("https://facebook.com/");
		}catch (Exception e) {
			// TODO: handle exception
		}

        // Explicit wait.........
//		long strTime = System.currentTimeMillis();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        driver.manage().window().maximize();
//        driver.get("https://omayo.blogspot.com");
//        WebElement webElement = driver.findElement(By.id("timerButton"));
//        wait.until(ExpectedConditions.elementToBeClickable(webElement));
//        webElement.click();
//        long endtime = System.currentTimeMillis();
//        System.out.println(((endtime-strTime)/1000.0)+" Seconds....");
        
        //Flunetwait.........
//		long strTime = System.currentTimeMillis();
//        driver.manage().window().maximize();
//        
//        driver.get("https://omayo.blogspot.com");
//        try {
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(6)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//        	public WebElement apply(WebDriver driver) {
//        		try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        		driver.switchTo().newWindow(WindowType.TAB);
//        		return null;
//        	}
//		});
//        }
//        catch (Exception e) {
//			// TODO: handle exception
//        	System.out.println("Completion of FluentWait");
//		}
//        
//        long endtime = System.currentTimeMillis();
//        System.out.println(((endtime-strTime)/1000.0)+" Seconds....");

	}

}
