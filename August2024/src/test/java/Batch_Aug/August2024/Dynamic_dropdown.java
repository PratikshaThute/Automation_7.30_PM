package Batch_Aug.August2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_dropdown extends Dynamic_code {

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		hiturl("https://www.redbus.in/");

		WebElement from = driver.findElement(By.cssSelector("input#src"));
		from.sendKeys("Nagpur");

		List<WebElement> frm_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));

		Thread.sleep(3000);
		
		for (int a = 0; a<= frm_options.size(); a++) {
			try {
				if (frm_options.get(a).getText().contains("Chatrapathi")) {
					frm_options.get(a).click();
				}
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
		}

		//System.out.println("selected location is : " + frm_options.getAttribute("value"));

		Thread.sleep(3000);
		WebElement To = driver.findElement(By.cssSelector("div.sc-htoDjs.kyqvCq"));
		Actions act = new Actions(driver);
		act.moveToElement(To).click().sendKeys("Mumbai");
		
		List<WebElement> To_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		
		for(int b = 0 ; b<= To_options.size(); b++) {
			if(To_options.get(b).getText().contains("Kurla")) {
				To_options.get(b).click();
			}
			
		}
		
	}

}
