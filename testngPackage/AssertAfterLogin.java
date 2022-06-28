package testngPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertAfterLogin {
	WebDriver driver;
	 @Test
	    public void performLogin() throws InterruptedException {
	        System.out.println("Performing Login and wait for 2 seconds");
	        driver.get("https://admin-demo.nopcommerce.com/login");
	        WebElement username = driver.findElement(By.name("Email"));
	        WebElement password = driver.findElement(By.name("Password"));
	        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	        username.clear();
	        username.sendKeys("admin@yourstore.com");
	        password.clear();
	        password.sendKeys("admin");
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	    }
	 
	 @Test(dependsOnMethods = "performLogin")
	    public void assertHomePage() throws InterruptedException {
	        System.out.println("--using Assert - Checking Homepage Text else, this test will fail");
	        String expectedTextFromPage="Dashboard";
	        String actualTextFromHomePage= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	        assertEquals(actualTextFromHomePage, expectedTextFromPage);
	        Thread.sleep(2000);
	    }
	
	@BeforeTest
    public void beforeTest() {
        System.out.println("--@beforeTest, set the browser, maximise the window");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
	 @AfterTest
	    public void afterTest() {
	        System.out.println("--@afterTest, closing the browser window");
	        driver.close();
	    }
}
