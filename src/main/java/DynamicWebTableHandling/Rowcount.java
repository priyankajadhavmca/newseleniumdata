package DynamicWebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rowcount {
	
	@Test
	public void verifyrows(){
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
         List<WebElement>NumberOfRows=  driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr"));
         System.out.println(NumberOfRows.size());
         Assert.assertEquals(NumberOfRows.size(), 7); //column also included
    

}}
