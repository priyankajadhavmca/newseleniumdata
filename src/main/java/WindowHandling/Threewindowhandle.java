package WindowHandling;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Threewindowhandle {

	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		 driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();

		Set<String>handler=driver.getWindowHandles();
		
         Iterator<String>it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent windowid"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child windowid"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priyanka");		
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google","title not matched");
		Thread.sleep(2000);
     driver.close();
      
     driver.switchTo().window(parentWindowId);
   Thread.sleep(2000);
	System.out.println("parent window popup title"+driver.getTitle());
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//a[@href='http://www.facebook.com' and @name='link1']")).click();

	Set<String>handler1=driver.getWindowHandles();
    Iterator<String>it1=handler1.iterator();
	
	String parentWindowId1=it1.next();
	System.out.println("parent windowid"+parentWindowId1);
	
	String childWindowId1=it1.next();
	System.out.println("child windowid"+childWindowId1);
	
	driver.switchTo().window(childWindowId1);
	Thread.sleep(2000);
	System.out.println("child window popup title"+driver.getTitle());
   //driver.close();
    driver.switchTo().window(parentWindowId1);
     Thread.sleep(2000);
    System.out.println("parent window popup title"+driver.getTitle());
     Thread.sleep(2000);
   
	driver.quit();
	}}
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

