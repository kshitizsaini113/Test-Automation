package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// driver.navigate().to("google.com");  

		driver.get("http://google.com");

		      

		// Click on the search text box and send value  

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("javatpoint tutorials"); 

		element.submit();

	}

}
