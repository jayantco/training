package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test
    public void openingAmazonSite() throws InterruptedException {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
        driver.get("http://www.amazon.com/");
        Thread.sleep(2000);
        driver.close();
    }
    @Test(dependsOnMethods = "openingAmazonSite")
    public void openingtwitter() throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
        driver.get("http://www.twitter.com/");
        Thread.sleep(2000);
        driver.close();
    }
    @Test(dependsOnMethods = "openingtwitter")
    public void openingYahooSite() throws InterruptedException {
        
    	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
        driver.get("http://www.yahoo.com/");
        Thread.sleep(2000);
        driver.close();
    }
}
