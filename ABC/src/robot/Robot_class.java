package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import basePackage.Base_class;

public class Robot_class extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		url("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		StringSelection ss = new StringSelection("\"C:\\Users\\JMS\\Desktop\\selenium notes\\java word files\\3. Project, package.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot r = new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}