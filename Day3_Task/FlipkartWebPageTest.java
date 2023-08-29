package classWork;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartWebPageTest {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmaralinganavar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Users\\mmaralinganavar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);
        Thread.sleep(5000);

        // Click on a filter option
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[2]")).click();
        Thread.sleep(3000);

        // Collect data
        List<WebElement> data = driver.findElements(By.className("_4rR01T"));
        List<String> SAMSUNG_Galaxy = new ArrayList<String>();

        for (WebElement webElement : data) {
            SAMSUNG_Galaxy.add(webElement.getText());
        }

        // Display SAMSUNG Galaxy F devices
        for (String galaxyFDevice : SAMSUNG_Galaxy) {
            if (galaxyFDevice.contains("SAMSUNG Galaxy F")) {
                System.out.println(galaxyFDevice);
            }
        }
        //scroll down we
        JavascriptExecutor jsExe = (JavascriptExecutor)driver;
        jsExe.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(1000);
        jsExe.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(1000);
        jsExe.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(2000);
        jsExe.executeScript("window.scrollBy(0,-1000)","");
        Thread.sleep(1000);
        jsExe.executeScript("window.scrollBy(0,-1000)","");
        Thread.sleep(1000);
        
        // Close the WebDriver
//        driver.quit();
    }

}
