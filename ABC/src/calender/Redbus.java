package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePackage.Base_class;

public class Redbus extends Base_class {

	public static void main(String[] args) {
		launch_Browser("chrome");
		url("https://www.redbus.in/");
		
		 WebElement calendar = driver.findElement(By.xpath("//div[@id='onwardCal']"));
	calendar.click();
	
	
	}

}
