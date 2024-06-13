package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi_site {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shaadi.com/");

		WebElement login = driver.findElement(By.xpath("//a[@data-testid='login_link']"));
		login.click();
		
		WebElement mail = driver.findElement(By.xpath("//input[@data-testid='login_email']"));
		mail.click();
		mail.sendKeys("pthute29@gmail.com");
		mail.clear();
		
		Thread.sleep(3000);
 WebElement pass = driver.findElement(By.xpath("//input[@data-testid='login_password']"));
 pass.click();
 
		
	}

}
