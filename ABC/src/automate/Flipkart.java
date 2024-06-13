package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class Flipkart extends Base_class{

	public static void main(String[] args) throws Throwable {
	
		launch_Browser("chrome");
		Takescreenshot("browser");
		
		url("https://www.flipkart.com/");
		Takescreenshot("flipkart_webpage");
		
		driver.findElement(By.cssSelector("div._1wE2Px"));
		 Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.cssSelector("div._1wE2Px"))).build().perform();
		 Takescreenshot("fashion");
		 
		 driver.findElement(By.xpath("//span[text()=\"Beauty, Toys & More\"]"));
		 act.moveToElement(driver.findElement(By.xpath("//span[text()=\"Beauty, Toys & More\"]"))).contextClick().build().perform();
		 Takescreenshot("toys_rightclick");
	
	}

}
