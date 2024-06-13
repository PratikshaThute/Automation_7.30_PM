package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class PageUP_PageDown extends Base_class{

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		url("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		action.moveToElement(searchbox).click().sendKeys("saree").build().perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();

	}

}
