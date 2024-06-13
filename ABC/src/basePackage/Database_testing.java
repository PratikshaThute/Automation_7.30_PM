package basePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Database_testing {
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");
	public static ResultSet result;
	public static String host = "localhost";
	public static String portnumber = "3306";

	public static void launch_Browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();

		}else if(browser.equalsIgnoreCase("firefox")) {
			
			 driver = new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			
			 driver = new EdgeDriver();
		}
		
		System.out.println("The browser launched is : "+ browser);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The webpage title is : "+ driver.getTitle());
	}
	
	public static void database(String databasename, String query) throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portnumber + "/"+ databasename, "root",
				"Pratiksha@25");

		Statement cs = connect.createStatement();
		result = cs.executeQuery(query);
		result.next();
	}
	public static void databasecol(String col, String locator) throws SQLException {
		System.out.println(result.getString(col));
		driver.findElement(By.xpath(locator)).sendKeys(result.getString(col));
	}
	
	
	


}
