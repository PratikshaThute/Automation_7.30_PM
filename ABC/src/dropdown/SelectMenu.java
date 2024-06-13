package dropdown;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import basePackage.Base_class;

public class SelectMenu extends Base_class{

	public static void main(String[] args) {
		launch_Browser("chrome");
		url("https://demoqa.com/select-menu");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
	}

	

}
