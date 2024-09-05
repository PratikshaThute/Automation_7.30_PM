package Batch_Aug.August2024;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Broswer_launch {

	public static void main(String[] args) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();
		
		//WebDriver drive = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapchat.com/");
	
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gw-ftGr-desktop-hero-7"));
		
		driver.findElement(By.className("skip-link"));
		
		driver.findElement(By.name("abc"));
		
		driver.findElement(By.linkText("Mobiles"));
		
		driver.findElement(By.linkText("Today's Deals"));
		
		driver.findElement(By.partialLinkText("Today's De"));
		
		driver.findElements(By.tagName("option"));
		
		//tagname#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tagname.class
		driver.findElement(By.cssSelector("div.right-pane-results-container"));
		
		//css- single attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]"));
		
		driver.close();
		
		
		
		
	

	}

}
