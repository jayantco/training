package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// In this code we are trying to open different website using Test annotation
public class OpenWebsites {
WebDriver driver;
	@Test
    public void openingAmazonSite() throws InterruptedException {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
        driver.get("http://www.amazon.com/");
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void openingCNNSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
        driver.get("http://www.cnn.com/");
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void openingYahooSite() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
        driver.get("http://www.yahoo.com/");
        Thread.sleep(2000);
        driver.close();
    }
}
