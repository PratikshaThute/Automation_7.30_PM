package basepackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Executable_class extends Propertiesfile_baseclass {
  @Test
  public void f() throws Exception {
	  property_file();
	  open_browser("chromebrowser");
	  navigate_url("facebookurl");
	  
	  //locate_emailbox
	  driver.findElement(By.cssSelector(p3.getProperty("emailbox_css")))
	  .sendKeys(p2.getProperty("useremail"));
	  
	  //locate_password
	  driver.findElement(By.cssSelector(p3.getProperty("password_css")))
	  .sendKeys(p2.getProperty("userpasswd"));
	  
	  //login
	  driver.findElement(By.xpath(p3.getProperty("login_xpath"))).click();
	  
	  
  }
}
