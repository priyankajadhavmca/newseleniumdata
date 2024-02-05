package newselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listboxselection {
	  @Test
	  public void listdemo() throws InterruptedException {
		  System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		 driver.get("https://courses.letskodeit.com/practice");
		 driver.manage().window().maximize();
		 WebElement ele=driver.findElement(By.xpath("//select [@name='multiple-select-example']"));
		 Select sel=new Select(ele);
        List<WebElement>listcount=sel.getOptions();
        int count=listcount.size();
        System.out.println("Checkbox count is"+count);

			 for(int i=0;i<count;i++){
			listcount.get(i).click();
			Thread.sleep(2000);
				
				 
			 }
		

}}
