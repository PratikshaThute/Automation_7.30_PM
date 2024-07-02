package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Demo_2 {

	@FindBy(css="input#id_gender2") WebElement gender;
	@FindBy(css="input#customer_firstname") WebElement firstname;
	@FindBy(css="input#customer_lastname") WebElement lastname;
	@FindBy(css="input#passwd") WebElement password;
	@FindBy(css="select#days") WebElement days;
	@FindBy(css="select#months") WebElement months;
	@FindBy(css="select#years") WebElement years;
	@FindBy(css="button#submitAccount") WebElement register;
	
	public Demo_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void personal_info() {
		gender.click();
		firstname.sendKeys("Chhaya");
		lastname.sendKeys("Thute");
		password.sendKeys("Viha@123");
		
		Select s1 = new Select(days);
		s1.selectByValue("27");
		
		Select s2 = new Select(months);
		s2.selectByValue("6");
		
		Select s3 = new Select(years);
		s3.selectByValue("1967");
		
		register.click();
	}
	
}
