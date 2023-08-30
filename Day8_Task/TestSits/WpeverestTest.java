package Day8_Task;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WpeverestTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration.form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Max@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Max1234@",Keys.ENTER);
				
		List<WebElement> ls = driver.findElements(By.className("ur-checkbox-list"));
		List<WebElement> ls1 = driver.findElements(By.name("multiple_choice_1641271687[]"));
		int a = 1;
		for (WebElement webElement : ls) {
			
			System.out.println(a+") "+webElement.getText()+" : ");
			a++;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Op : ");
		int i = sc.nextInt();
		System.out.print("------------------------"+"\n");
		ls1.get(i-1).click();
		
		int b = 1;
		for (WebElement webElement : ls1) {
			System.out.print(b+") ");
			System.out.println(webElement.isSelected()?"Selected":"Not Selected");
			b++;
		}
		
		Thread.sleep(7000);
		driver.quit();
	}

}
