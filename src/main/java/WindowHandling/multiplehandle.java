package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiplehandle {
  static WebDriver driver;
@Test
public void tt() throws Exception{
	
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	driver.manage().window().maximize();
	
	String parent=driver.getWindowHandle();//before clicking need return me parent window id
	
	System.out.println("parent window id"+ parent);
	
	WebElement ele=driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
	ele.click();

	Set<String>handler=driver.getWindowHandles(); //return set of string
	
	int count=handler.size();
	
	System.out.println("total windows "+count);
	
	for(String child:handler)        //using list reference we itereate value stored into  webelement ref child then compare
	{
		if(!parent.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
							
			driver.findElement(By.name("q")).sendKeys("seleniumwebdriver");
			
			System.out.println("Child window Title"+driver.getTitle());
			
			Thread.sleep(2000);
			driver.close();
			
		}
	}
	driver.switchTo().window(parent);
	System.out.println("Parent window Title"+driver.getTitle());


}}