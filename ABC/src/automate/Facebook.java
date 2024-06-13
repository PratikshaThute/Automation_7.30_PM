package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

				//locate Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

				// Enter Email 
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc @gmail.com");

				// Enter Password
		driver.findElement(By.cssSelector("input#pass")).sendKeys("ab @12");

				Thread.sleep(2000);
				//Clear input 
		driver.findElement(By.cssSelector("input#email")).clear();
				}
				}


	
