package Day7_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTablesExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
//		driver.get("http://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		List<WebElement> tabless = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
//		List<String> sortnum = new ArrayList<String>();
//		
////		for (WebElement webElement : tabless) {
////			System.out.println(webElement.getText());
////		}
//		
//		for(int i = 0;i<tabless.size();i++) {
//			WebElement num = driver.findElement(By.xpath("//table[@id='table1']//tr["+(i+1)+"]//td[3]"));
//			sortnum.add(num.getText());
//		}
//		//Collections.sort(sortnum);
//		Scanner sc = new Scanner(System.in);
//		String tr = sc.next();
//		
//		for (String sortls : sortnum) {
//			System.out.println(sortls);
//			if (sortls.equals(tr)) {
//			    System.out.println("Strings are equal.");
//			} 
//		}
		driver.get("https://www.abhibus.com/?msclkid=a5f8e949326f14a130a48da4fc9c7429&utm_source=bing&utm_medium=cpc&utm_campaign=Abhibus_Brand_ROI&utm_term=abhibus&utm_content=Brand");
		driver.manage().window().maximize();
		
		WebElement goingTo = driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker1']"));
		WebElement fromTo = driver.findElement(By.xpath("//*[@id=\"source\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("arguments[0].setAttribute('value','Mumbai')",goingTo);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("arguments[0].setAttribute('value','Pune')",fromTo);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"frmFinal\"]/div/div[5]/a")).click();
		
		Thread.sleep(5000);
		driver.quit();
				
	}

}
