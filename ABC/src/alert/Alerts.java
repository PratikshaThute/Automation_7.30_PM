package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePackage.Base_class;

public class Alerts extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		url("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
	Alert alert	= driver.switchTo().alert();

	alert.accept();
	
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	
	WebElement al = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));al.click();
	Alert promptalert = driver.switchTo().alert();
	promptalert.accept();
	System.out.println(al.getText());
	}

}
