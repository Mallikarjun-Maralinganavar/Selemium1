/*Test the PawsIndia Site........ 
 * 
 * 
 * Aim : To check the website. first we are going to search this website in Google after appearing we are going to click this site in this site we are going to
 		 search option type the for dog food and takeing item and adding into cart and removing from cart.
 *
 *
 * @author Mallikarjun Maralinagnavar...
 * 
 * @since JDK17 (08/24/2023)....
 * 
 * Dependencies 
 * 1)Selenium-Java      -  4.9.1 ....
 * 2)Webdriver-Manager  -  5.3.3 ....
 * 
 * */
package PawsIndia.PawsIndiacartTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PawsIndia {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmaralinganavar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		//chrome setp
		co.setBinary("C:\\Users\\mmaralinganavar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		
		//Opening Google
		driver.navigate().to("https://www.google.co.in/");
		
		//maximize
        driver.manage().window().maximize();
		
		//Search for pawindia
		driver.findElement(By.name("q")).sendKeys("PawsIndia",Keys.ENTER);
		
		//Opening pawsindia
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3")).click();
		
		//search for dog food
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div/div[1]/div/div[3]/div[1]/div/div/div[1]/form/input[3]")).sendKeys("Dog Food",Keys.ENTER);
		
		//Add To the Cart
		driver.findElement(By.xpath("//*[@id=\"grid-product-form--7606068445436-template--16728827789564__main\"]/a")).click();
		
		//Add To the Cart
		driver.findElement(By.xpath("//*[@id=\"swatch-grid-product-form--7606068445436-template--16728827789564__main-\"]/div[3]/button")).click();
		try{
			
			//submit  
	        driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div/div[1]/div/div[3]/div[2]/a/svg/path[3]")).click();

	        } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("no");
	            
	        }
		//close pop-up
		driver.findElement(By.xpath("//*[@id=\"search-372-results-found-for-quot-dog-food-quot\"]")).click();
		
		//Switch Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//opens new tab for cart
		driver.get("https://pawsindia.com/cart");
		
		//Switch Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Open one more new tab for cart
		driver.get("https://pawsindia.com/cart/change?line=1&quantity=0");
	}
}
