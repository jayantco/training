package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// In this code we are trying to perform click on dropdown in form
// In case of Dropdown we use Select class
// Select the elements and make text visible and submit
public class Dropdown {

	public static void main(String[] args) {
		// Set the path of chromeDriver browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the chromeDriver browser
        	WebDriver driver = new ChromeDriver();
		// pass the link of website
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
		
		// Select class is used in case of dropdown and pass the value of element in constructor
	        Select countrySelect = new Select(driver.findElement(By.name("country")));
	        
		// using the countrySelect call selectByVisibleText method and select the text in dropdown
	        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
	        //or
	        countrySelect.selectByVisibleText("France");
	        
	        //Same explanation for skill dropdown
	        Select skillSelect = new Select(driver.findElement(By.name("skill")));
	        //using skillSelect to select menu options -- Programming
	        skillSelect.selectByVisibleText("Programming");
	        System.out.println("selectByVisibleText(\"Programming");
	        //OR
	        //using skillSelect to select menu options -- Database
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
	        
	        //Click on Send Button
	        driver.findElement(By.name("submit")).click();
	        System.out.println("Form Fill-up Succesfull");
	        driver.quit();
	}

}
