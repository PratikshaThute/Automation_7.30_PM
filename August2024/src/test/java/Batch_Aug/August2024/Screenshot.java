package Batch_Aug.August2024;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Dynamic_code {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Evidences/Browser_launched_1.png");
		FileHandler.copy(Source, target);

		hiturl("https://snapdeal.com/");

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File Source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Evidences/Snapdeal_1.png");
		FileHandler.copy(Source1, target1);
		
		driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("Kitchen products");
		
		//By declaring project path
		
		String Projectpath = System.getProperty("user.dir");
		
		System.out.println(Projectpath);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(Projectpath + "\\Evidences\\Search_product.png");
		FileHandler.copy(Source2, target2);

	}

}

//with the help of ref.var of takesscreenshot interface use getscreenshotas method.
//directly with foldername and file name
//Tell driver to take the screenshot
// use takescreenshot interface (you need to create object)
