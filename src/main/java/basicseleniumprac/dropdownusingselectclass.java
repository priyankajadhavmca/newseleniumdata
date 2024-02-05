package basicseleniumprac;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownusingselectclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.xpath("//a[text()='Create New Account' and @role='button']")).click();
	   
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
    WebElement day= driver.findElement(By.id("day"));  //create select class for each and every elemnt
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("yea-r"));
	  
  Select select1=new Select(day);         //select class aviliable in selenium.pass the webelement in to the class
      
   //******************** print total days**********
    List<WebElement>listdays=select1.getOptions();                 
   System.out.println("total days are "+ listdays.size());
   
   //************print all the values from dropdown********************
   
   for(int i=0; i<=listdays.size();i++){
	   String dayval=listdays.get(i).getText();
	   System.out.println(dayval);
	   if(dayval.equals("15")){
		   listdays.get(i).click();
		   break;   //if i  15 get  come out the loop
	   }
   }}}   
   
   
   
   //Select select1=new Select(day);         //select class aviliable in selenium.pass the webelement in to the class
   //select1.selectByVisibleText("10");	
 
   
//     Select select2=new Select(month);         //select class aviliable in selenium.pass the webelement in to the class
//      select2.selectByVisibleText("may");	
//	  
//      Select select3=new Select(year);         //select class aviliable in selenium.pass the webelement in to the class
//     select3.selectByVisibleText("1991");	
	
	
	
	