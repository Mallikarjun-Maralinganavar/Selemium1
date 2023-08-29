package sample.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmaralinganavar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		co.setBinary("C:\\Users\\mmaralinganavar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		
		//To block the notifications............
		//co.addArguments("--disable-notifications--");
		
		
		///driver.get("https://learn.microsoft.com/en-us/dotnet/standard/get-started");
		//Thread.sleep(5000);
		//driver.close();
		/*
		 * Whit out Using Get We Can get URL to be Open
		 */
		driver.navigate().to("https://google.com");
		
		//Aout Typeing  
		
		//driver.findElement(By.name("q")).sendKeys("One Piece");
		
		//toclike is uesd for bunt  
		
		//driver.findElement(By.className("gNO89b")).submit();
		
		//Pressing the Enter Scr btn
		//driver.findElement(By.name("q")).sendKeys("One Piece",Keys.ENTER);
		
		/*
		 * Using Link Text click href link
		 */
		
		//WebElement gmailbtn = driver.findElement(By.partialLinkText("Gmail"));
		//here we using gmail click
		//gmailbtn.click();
		
		
		//isEnabled CMD for store boolean value and whether working or not
//		boolean isgmaileEnabled = gmailbtn.isEnabled();
//		System.out.println(isgmaileEnabled);
		
		//
		
		
		//isSelected is work on checkbox 
		
		
		/*
		 *To get Attribute Name 
		 */
		
//		WebElement searchboxElement = driver.findElement(By.id("APjFqb"));
//		String valeofthe = searchboxElement.getAttribute("data-ved");
//		System.out.println(valeofthe);
//		
		/*
		 * To get tage name .getID
		 */
		
		
		/*XPATH--------------------------------------------------------------
		 * */
		//Locators----Xpath XLM Path It gives location of the element-------
		//to get xpath we have rigth click go to copy goto xpath....
        // ..//*[@id="APjFqb"].....this for xpth of secrche box
		// affter the xpath parent.......
		//affter the ancestor........
		//preceding-sibling..........
		//following-sibling........
		// ../html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea.... this fullxpath....
		
		/**/
		WebElement xpthSearchbox = driver.findElement(By.xpath("//*[starts-with(@id,\"APj\")]//parent::div"));
		String valeofthe = xpthSearchbox.getAttribute("maxlength");
		System.out.println(valeofthe);
		
		/*CSS Selector-----------------------------------
		 * */
		
		
		
	}

}
