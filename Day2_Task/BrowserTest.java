package sample.JavaSelenium;

import java.sql.DriverManager;
import java.util.Scanner;
import java.util.Set;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.util.concurrent.AbstractFuture;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest {
	 static String URL;
	 static WebDriver driver;
	 
		static String pageSorce() {
			driver=new EdgeDriver();
			driver.get(URL);
			return driver.getPageSource();
		}
		
		static String tital() {
			driver=new EdgeDriver();
			driver.get(URL);
			return driver.getTitle();
		}
		
		
	
		public static void main(String[] args) throws Exception {
			WebDriverManager.edgedriver().setup();
			
//			Scanner sc = new Scanner(System.in);
//
//			while(true) {
//				System.out.print("Enter URL :");
//				URL = sc.next();
//				System.out.print("Enter the Number : ");
//				int i = sc.nextInt();
//					if(i>0) {
//						switch (i) {
//						case 1:{
//							System.out.println(pageSorce().length());
//							driver.close();
//							}
//							break;
//						case 2:{
//							System.out.println(tital());
//							driver.close();
//							}
//							break;
//						default:
//							break;
//						}
//						}
//					else {
//						break;
//					}
//				}
			//browser setup for Chrome.
//			WebDriverManager.chromedriver().setup();
//			ChromeOptions co=new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
//			//Chrome driver object
//			WebDriver driver=new ChromeDriver(co);
			//
//			WebDriverManager.edgedriver().setup();
//			//EdgeDriver is Conscter
//			WebDriver driver=new EdgeDriver();
//			driver.get("https://www.google.co.in/");
//			String title=driver.getTitle();
//			System.out.println(title);
//			String pageSorce=driver.getPageSource();
//			System.out.println(pageSorce.length());
//			driver.close();
//			driver.quit();
//			driver.manage().window().maximize();
//			driver.get("https://www.youtube.com/");
//			driver.navigate().back();
//			driver.navigate().forward();
//			//Adding the Dealy in Excutions
//			Thread.sleep(10000);
//			driver.navigate().refresh();
			
			
			//---------------------------------------------
			driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.youtube.com/");
			Set<String> handles = driver.getWindowHandles();
			
			// Priting the ID's
//			for(String h: handles) {
//				System.out.println(h);
//			}
			
			for(String h: handles) {
				System.out.print(driver.switchTo().window(h)+" : ");
				System.out.println(driver.getPageSource().length());
				//driver.quit();
			}
		}
}