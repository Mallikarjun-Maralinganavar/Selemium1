package sample.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver  driver = new ChromeDriver();
//			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div"));
//			WebElement useElement = driver.findElement(RelativeLocator.with(By.tagName("input")).below(element));
//			useElement.sendKeys("Admin");
//			
//			WebElement passWard = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
//			passWard.sendKeys("admin123");
//			
//			driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("password"))).click();
//			
//			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//			driver.quit();
			
			driver.navigate().to("https://www.softwaretestingmaterial.com/");
			driver.manage().window().maximize();
			
			//------------------------------------------------------------------------
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
			
			
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//Finding Left Element..... Using RelativeLocator
			
			
			WebElement expLetof = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
			WebElement leftOf = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(expLetof));
			wait.until(ExpectedConditions.elementToBeClickable(leftOf));
			leftOf.click();
			
			//---------------------------------------------------------------------------
			//driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"))).click();
			
			
			//Finding Right Element..... Using RelativeLocator
			
			driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"))).click();
			
			WebElement nears = driver.findElement(RelativeLocator.with(By.tagName("img")).near(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img")));
			nears.click();
			System.out.println(nears.getText());
			//driver.quit();
			

	}

}
