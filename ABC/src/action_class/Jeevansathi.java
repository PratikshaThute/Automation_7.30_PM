package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class Jeevansathi extends Base_class{

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		url("https://www.jeevansathi.com/");

		Actions action = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("//p[text()='BROWSE PROFILES BY']"));
		action.moveToElement(profile).perform();

		WebElement occupation = driver.findElement(By.xpath("//p[text()='Occupation']"));
		action.moveToElement(occupation).perform();

		WebElement IT = driver.findElement(By.xpath("//a[text()='IT Software']"));
		action.moveToElement(IT).click().build().perform();
		System.out.println("The current webpage title is : "+ driver.getTitle());
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.cssSelector("a.drop.cursp"));
		action.moveToElement(search).contextClick().click().build().perform();

		driver.navigate().back();
		WebElement register = driver.findElement(By.cssSelector("div#register_button"));
		action.moveToElement(register).contextClick().build().perform();
	}

}
