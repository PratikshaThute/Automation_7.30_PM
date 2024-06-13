package basePackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class {

	
		public static WebDriver driver; 
		public static String projectpath = System.getProperty("user.dir");
		
		public static void launch_Browser(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				
			}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		    }
			
			System.out.println("the launch browser is : "+ browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		public static void url(String url) {
			driver.get(url);
			System.out.println("The current url is :" + driver.getCurrentUrl());
			System.out.println("The title of webpage is : "+ driver.getTitle());
		}
		
		public static void Takescreenshot(String filename) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("./Evidences/" + filename + ".png");
//			File target = new File(projectpath + "\\Evidences\\" + filename + ".png");
			FileHandler.copy(source, target);
			
		}
		
}


