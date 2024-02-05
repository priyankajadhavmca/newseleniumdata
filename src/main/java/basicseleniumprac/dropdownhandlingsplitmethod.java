package basicseleniumprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandlingsplitmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.xpath("//a[text()='Create New Account' and @role='button']")).click();
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
    WebElement day= driver.findElement(By.id("day"));  //create select class for each and every element/dropdown
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("year"));
	
	String dob="10_May_1991";
	
	String dobArr[]=dob.split("_"); //split method reurn string type of array
	selectvaluefromdropdown(day, dobArr[0]);
	 selectvaluefromdropdown(month,dobArr[1]);
	 selectvaluefromdropdown(year,dobArr[2]);
	}
	public static void selectvaluefromdropdown(WebElement element,String value){  //used genric method
	Select select=new Select(element);
	select.selectByVisibleText(value);
	

	}

}
