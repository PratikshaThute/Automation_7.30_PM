package facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Facebook {

	public static void main(String[] args) throws Exception {
		
		//launch broswer
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//hit the url using get method
		driver.get("https://www.facebook.com/");
		
		//find the element you wants to perform action on and use sendkeys to enter input
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("pthute29@gmail.com");
		
		//		Thread.sleep(3000);
		
		//use clear method to remove the text enter as input
		//		username.clear();
		

	WebElement Fp	= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
	//use gettext method to get the text of web element you have find
	System.out.println("the text is : "+ Fp.getText());
	Thread.sleep(3000);
	
	//use click method if wants to click
	Fp.click();

	
	WebElement Fp_details = driver.findElement(By.cssSelector("input#identify_email"));
	Fp_details.sendKeys("pthute29@gmail.com");
	
	//use getattribute method if gettext() is not working and if you wants to get the value you had entered
	System.out.println("The details shared is :"+ Fp_details.getAttribute("value"));
		
	WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
	
	//you can use getattribute to get the value of attribute from the dom file
	System.out.println("the value of type attribute is :"+ btn.getAttribute("type"));
	btn.click();
	
	WebElement TAW = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	
	//use get location to get x and y coordinates
	System.out.println("the x- coordinate is : "+ TAW.getLocation().x);
	System.out.println("the y- coordinate is : "+ TAW.getLocation().y);
	
	//to get the size of button or searchbox
	System.out.println("the size of TAW btn is : "+ TAW.getSize());
	
	
	WebElement continue_btn = driver.findElement(By.xpath("//button[@type='submit']"));
	
	//to get the tagname of webelement from dom file
	System.out.println("the tagname for continue_btn is : "+ continue_btn.getTagName());
	
	WebElement loginwthpass = driver.findElement(By.cssSelector("a._aklt"));
	//to check web element is displayed or not
	System.out.println("is the text displayed : "+ loginwthpass.isDisplayed());
	
	//to check web element is enabled or not
	System.out.println("is the text enabled : "+ loginwthpass.isEnabled());
	
	WebElement img = driver.findElement(By.xpath("//div[@style='line-height:0']"));
	System.out.println("the img is enabled :"+ img.isEnabled());
	
	// to go back, to refresh the page use navigate method of webdriver interface
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	// to close the driver
	driver.close();
	
	}
	

}
