package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class Jquery_droppable extends Base_class{

	public static void main(String[] args) {
		launch_Browser("chrome");
		url("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		
		//to come out of frame
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//a[text()='Selectable']"));
		element.click();
		System.out.println("the current title is : " + driver.getTitle());
	}

}
