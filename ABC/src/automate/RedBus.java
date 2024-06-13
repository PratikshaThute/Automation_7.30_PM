package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");

		// Capture tagname 
		WebElement gettag = driver.findElement(By.xpath("//input[@id='src']")); 
		System.out.println("Tagname of Web Element is:-"+ gettag.getTagName());

				// Check element is visible 
		WebElement logo = driver.findElement(By.cssSelector("img.rb_logo"));
		System.out.println("Check logo is visible:- "+logo.isDisplayed());

				// Check element is enabled 
		System.out.println("Check logo is Enabled:- "+logo.isEnabled());

	}

}
