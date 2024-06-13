package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.amazon.in/");

	// locate link 
	WebElement link = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));

	String link_name = link.getText();
//	System.out.println("The link name is:- "+link_name);

	System.out.println("The link name is:- "+link.getText());
	link.click();

	// Capture Attribute value
	System.out.println("The value of href Attribute is:- " + link.getAttribute("href"));
	System.out.println("The value of Class Attribute is:- " + link.getAttribute("class"));

	System.out.println("The Name of link is:- "+ link.getAttribute("value"));

	// Enter Text in Search Box 
	WebElement searchbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbo x']"));
	searchbox.sendKeys("Mobile"); 
	System.out.println("Entered Text in Search box is:- " + searchbox.getAttribute("value"));

	// Capture x-cordinate 
	System.out.println("The x-co-ordinate is:- " + searchbox.getLocation().x); 
	System.out.println("The y-co-ordinate is:- " + searchbox.getLocation().y);

	// Capture Size of searchbox 
	System.out.println("The size of searchbox is:- " + searchbox.getSize());


	}

}
