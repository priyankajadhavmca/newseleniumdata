package DynamicWebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class columncount {

	@Test
	public void verifyallColumn(){
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
         List<WebElement>allHearder=  driver.findElements(By.xpath("//table[contains(@id,'customers')]//th"));
        System.out.println("column count is"+allHearder.size());
         Assert.assertEquals(allHearder.size(),5,"column count not same");
         
         boolean status=false; 
         
         for(WebElement ele:allHearder){
        	String value= ele.getText();
        	System.out.println(value);
        	if(value.contains("Country")){
        		status=true;
        		//break;
        	}
         }
         Assert.assertTrue(status,"Header is not present");
         
         

	}

}
