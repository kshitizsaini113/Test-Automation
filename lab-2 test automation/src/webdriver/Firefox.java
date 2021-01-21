package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		// driver.navigate().to("google.com");  

		driver.get("http://google.com");

		      

		// Click on the search text box and send value  

		WebElement element = driver.findElement(By.name("q"));
		// element.click();
		//
		
		element.sendKeys("javatpoint tutorials"); 
		
		//
		// element.submit();
		//		   
		WebElement googleSearch = driver.findElement(By.className("gNO89b"));
		googleSearch.submit();
		   
		   
		   
		driver.close();
		   

	}

}
