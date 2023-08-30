package Day8_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartHospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@style='background:#e91e63;']")).click();
		driver.findElement(By.xpath("//*[@class='btn']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Hi",Keys.ENTER);
		
		WebElement freams = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]/div[2]/iframe"));
		driver.switchTo().frame(freams);
		driver.findElement(By.xpath("//*[@class='form-control wysihtml5-editor']")).sendKeys("Hi",Keys.ENTER);
		driver.switchTo().defaultContent();
		
		WebElement noticeDate = driver.findElement(By.xpath("//*[@id=\"date\"]"));
		WebElement publishDate= driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','12/31/2023')", noticeDate);
		js.executeScript("arguments[0].setAttribute('value','01/31/2024')",publishDate);
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText());
		driver.quit();
	}

}
