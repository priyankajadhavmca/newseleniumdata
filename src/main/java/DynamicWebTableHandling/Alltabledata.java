package DynamicWebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alltabledata {
	@Test
	public void verifyrows() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com");
         List<WebElement>Alldata=  driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr//td")); //all table data
         System.out.println("table data size is "+Alldata.size());
 
       for(int i=0;i<Alldata.size();i++){
        String value=Alldata.get(i).getText();
        System.out.println(value);
        if(value.contains("Selenium")){
        	Alldata.get(i);
        }
        	
        } 
          
        boolean datastatus=false;
         for(WebElement ele:Alldata){
        	String value= ele.getText();
        	System.out.println(value);
        	if(value.contains("Ola")){
        		datastatus=true;
        		//break;
        	}
         }
         Assert.assertTrue(datastatus,"Record is not present");    
       
         driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input[@type='checkbox']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[text()='Ola']//following::td[3]//a")).click();    
          driver.close();

               
               }
}