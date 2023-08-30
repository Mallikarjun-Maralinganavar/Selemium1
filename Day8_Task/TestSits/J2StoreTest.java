package Day8_Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J2StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> productsElement = driver.findElements(By.className("product-title"));
		List<String> sortProductsLs = new ArrayList<String>();
		
		for (WebElement webElement : productsElement) {
			sortProductsLs.add(webElement.getText());
		}
		
		Collections.sort(sortProductsLs);
		
		for (String string : sortProductsLs) {
			System.out.println(string);
		}
		
		driver.quit();
	}

}
