package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dynamic_package.Base_class;

public class Demo_1 extends Base_class{

	@FindBy(css="a.login") WebElement Sign_in_btn; 
	@FindBy(css= "input#email_create") WebElement email_box;
	@FindBy(css="button#SubmitCreate") WebElement create_an_acc;
	
	
	public Demo_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Account() {
		Sign_in_btn.click();
		scroll(400);
		email_box.sendKeys("Nancy123@gmail.com");
		create_an_acc.click();
	
	}
	
	}


