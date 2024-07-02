package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertiesfile_baseclass {

	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p1;
	public static Properties p2;
	public static Properties p3;
	public static WebDriver driver;

	public static void property_file() throws Exception {

		// Browserurl
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\Browser_url.properties");
		p1 = new Properties();
		p1.load(fis);

		// Automationpractise
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\Automation_practise_data.properties");
		p2 = new Properties();
		p2.load(fis);
		
		//locators
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\locators.properties");
		p3 = new Properties();
		p3.load(fis);

	}

	public static void open_browser(String browserkey) {

		if (p1.getProperty(browserkey).equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (p1.getProperty(browserkey).equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (p1.getProperty(browserkey).equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("the browser open is : " + p1.getProperty(browserkey));

	}

	public static void navigate_url(String url_key) {
		driver.get(p1.getProperty(url_key));
		System.out.println("Navigate url is : " + p1.getProperty(url_key));
		System.err.println("The title is : "+ driver.getTitle());
	}
}
