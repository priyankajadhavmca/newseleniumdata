package newselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radiobottonmultiple {
	@Test
	public void radiodemo() throws Exception{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		 driver.manage().window().maximize();
	     List<WebElement>radiolist=driver.findElements(By.xpath("//input[@type='radio' and @name='cars']"));
	     
     for(int i=0;i<radiolist.size();i++){
	    	WebElement ele= radiolist.get(i);
	    	ele.click();
	    boolean b1=	ele.isSelected();
    System.out.println(b1);                     //logic for select all radio button
	     
	    // ***************************************************************************************************
	    	
	    	}}}
