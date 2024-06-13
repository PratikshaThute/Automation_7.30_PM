package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class Railyatri extends Base_class {

	public static void main(String[] args) {
		launch_Browser("chrome");
		url("https://www.railyatri.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender.click();
		
		String month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
		System.out.println(month_year);
		

		while(true) {
		if(!(month_year.equalsIgnoreCase("August 2024"))) {
			driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();
		}else {
			break;
		}

		driver.findElement(By.xpath("//td[text()='13']")).click();
		System.out.println("the date selected is : " + calender.getAttribute("value"));
		}
		


	}

}
