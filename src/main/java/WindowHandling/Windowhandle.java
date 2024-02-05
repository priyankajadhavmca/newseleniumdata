package WindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {

	static WebDriver driver;
	@Test
	public void handlemultiplewindow() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	     driver.manage().window().maximize();
	     
	     String parentwindowid=driver.getWindowHandle();
	     System.out.println(parentwindowid);
	   
	     WebElement ele=driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
	 	ele.click();

	     Set<String>allwindow= driver.getWindowHandles();   //getwindowhandles return set of string
	     System.out.println("total windows "+allwindow.size());
	 	
	 	ArrayList<String>tabs=new ArrayList<String>(allwindow);
	 	
	 	driver.switchTo().window(tabs.get(1));
	 	driver.close();
	 	
	     driver.switchTo().window(tabs.get(2));
	     driver.close();
	  
	     driver.switchTo().window(tabs.get(0));
	    System.out.println("Title of parent window"+driver.getTitle());
	 }}