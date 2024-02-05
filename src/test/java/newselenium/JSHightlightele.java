package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSHightlightele {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		  driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		  driver.manage().window().maximize();
			
	        JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window.scrollBy(0,600)");
			
			//JavascriptExecutor jss=((JavascriptExecutor)driver);
			//jss.executeScript("window.scrollBy(0,-300)");
			
//			JavascriptExecutor executor=((JavascriptExecutor)driver); //i have to check footer link on page
//			executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");  //it scroll bottom up the page
//			
//		WebElement element=	driver.findElement(By.xpath("//a[contains(text(),'VBScript')]"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
		
		Thread.sleep(3000);
			
			 driver.close();
			
		    }
		    
	}