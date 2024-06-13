package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav_cs_fresh"));
		
		driver.findElement(By.className("nav-logo-link nav-progressive-attribute"));
		
		driver.findElement(By.name("glow-validation-token"));
		
		driver.findElement(By.linkText("Account & Lists"));
		
		driver.findElement(By.partialLinkText("Account &"));
		
		driver.findElement(By.partialLinkText("& Lists"));
		
		driver.findElements(By.tagName("div"));
		
		//tagname and id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tagname and class
		driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite"));
		
		//tagname & attribute
		driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		
		//tagname & multiple attribute
		driver.findElement(By.cssSelector("input[type=\"hidden\"][id=\"isscrid\"]"));
		
		//contains
		driver.findElement(By.cssSelector("a[id*=\"amazonprime\"]"));
		
		//start with
		driver.findElement(By.cssSelector("a[id^=\"nav-link-ama\"]"));
		
		//ends with
		driver.findElement(By.cssSelector("a[id$=\"onprime\"]"));
		
		
		
	}

}
