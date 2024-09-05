package Batch_Aug.August2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown extends Dynamic_code{

	public static void main(String[] args) {
		
	launch_browser("chrome");
	hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjw59q2BhBOEiwAKc0ijRIn5Zhpz3LhX65C2At3IJ1aj3TNvkpCwdTrfulggDntplYD9DkkVhoC16oQAvD_BwE");
	
	WebElement create_profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
	
	Select sd = new Select(create_profile_for);
	
	//sd.selectByVisibleText("Relative/Friend");
	
	//sd.selectByValue("6D");
	
	sd.selectByIndex(7);
	}

}
