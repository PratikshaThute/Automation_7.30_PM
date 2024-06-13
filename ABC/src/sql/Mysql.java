package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import basePackage.Base_class;

public class Mysql extends Base_class {
	public static void main(String[] args) throws SQLException {
		String host ="localhost";
		String portnumber = "3306";
		launch_Browser("chrome");
		url("https://www.facebook.com/");
	
Connection connect = DriverManager.getConnection("jdbc:mysql://" +host+ ":"+portnumber+ "/stp", "root", "Pratiksha@25");

	Statement cs = connect.createStatement();
	ResultSet result = cs.executeQuery("select username, password from facebook where sr_no=1;");
	result.next();
	
	System.out.println(result.getString("username"));
	System.out.println(result.getString("password"));
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(result.getString("username"));
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(result.getString("password"));
	
	}

}


