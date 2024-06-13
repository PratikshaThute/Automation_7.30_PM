package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Select extends basePackage.Base_class{

	public static void main(String[] args) {
		launch_Browser("chrome");
		url("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement products = driver.findElement(By.cssSelector("select#first"));
	org.openqa.selenium.support.ui.Select select =  new org.openqa.selenium.support.ui.Select(products);
	select.selectByValue("Google");
	
	WebElement animals = driver.findElement(By.cssSelector("select#animals"));
	org.openqa.selenium.support.ui.Select select1 =  new org.openqa.selenium.support.ui.Select(animals);
	select1.selectByVisibleText("Big Baby Cat");
	
	
	}

}

