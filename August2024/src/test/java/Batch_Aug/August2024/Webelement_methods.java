package Batch_Aug.August2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//click
		Searchbox.click();
		
		//sendkeys
		Searchbox.sendKeys("Mobiles");
		
		Thread.sleep(3000);
		
		//clear
		Searchbox.clear();
		
		Searchbox.sendKeys("Books");
		
		//getAttribute
		System.out.println(Searchbox.getAttribute("value"));
		
		//getlocation
		System.out.println("The x coordinate of searchbox lies at : " + Searchbox.getLocation().x);
		System.out.println("The y coordinate of searchbox lies at : " + Searchbox.getLocation().y);
		
		//get size
		System.out.println("size of searchbox is : " + Searchbox.getSize());
		
		//getTagname
		System.out.println(Searchbox.getTagName());
		
		//is displayed
		
		//is enabled 
		
		//is selected
		
		//getText
		//System.out.println(Searchbox.getText());
		
	}

}
