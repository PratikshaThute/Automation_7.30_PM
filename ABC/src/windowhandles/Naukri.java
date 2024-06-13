package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import basePackage.Base_class;

public class Naukri extends Base_class{

	public static void main(String[] args) {
	launch_Browser("chrome");
	url("https://www.naukri.com/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	driver.findElement(By.xpath("//a[text()='About us']")).click();
	
	Set<String> window = driver.getWindowHandles();
	Iterator<String> id = window.iterator();
	
	String parent_window = id.next();
	System.out.println("the parent window id is : "+ parent_window);
	
	String child_window = id.next();
	System.out.println("the child window id is : "+ child_window);
	
	driver.switchTo().window(child_window);
	System.out.println("switch to child window");
	
	driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();
	System.out.println("clicked on webelement");
	
	driver.switchTo().window(parent_window);
	System.out.println("back to parent window");
	
	driver.quit();

	}

}
