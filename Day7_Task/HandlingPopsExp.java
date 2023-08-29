package Day7_Task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopsExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//*[@name='submit']")).click();
//
//        Alert alert=driver.switchTo().alert();
//
//        System.out.println(alert.getText());
//        alert.accept();
//        
//        Thread.sleep(3000);
//        Alert alert1 =  driver.switchTo().alert();
//        
//        System.out.println(alert1.getText());
//        
//        alert1.accept();
        
        driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
