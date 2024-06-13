package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class Jquery_slider extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		url("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
			
		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		
		action.moveToElement(slider).clickAndHold().moveByOffset(500, 0).release().build().perform();
		Thread.sleep(3000);
		
		action.clickAndHold(slider).moveByOffset(-400, 0).release().build().perform();
		Thread.sleep(3000);
		
		action.dragAndDropBy(slider, 200, 0).build().perform();

	}

}
