package Batch_Aug.August2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("Chrome");
		
		hiturl("https://www.jeevansathi.com/");
		
		Actions act = new Actions(driver);
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		act.moveToElement(email).click().sendKeys("pthute29@gmail.com").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		WebElement eye_btn = driver.findElement(By.cssSelector("div#eye"));
		act.moveToElement(eye_btn).click().build().perform();

		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(4000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		
	}

}
