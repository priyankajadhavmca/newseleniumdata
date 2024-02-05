package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonbuttonusingjs {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=us");
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].value='priya@gmail.com'", uname);   //without sendkeys
		  
		WebElement btn=driver.findElement(By.xpath("//input[@id='login-signin']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", btn);
		
	}

}
