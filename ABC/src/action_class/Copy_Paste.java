package action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Copy_Paste extends basePackage.Base_class{

	public static void main(String[] args) {
	launch_Browser("chrome");
	url("https://www.jeevansathi.com/");
	
	Actions act= new Actions(driver);
	
	WebElement email = driver.findElement(By.cssSelector("input#email"));
	
	WebElement phone = driver.findElement(By.cssSelector("input#phoneNumber"));
	
	act.click(email).sendKeys("dfghjk").build().perform();
	
	act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
}
	
}

