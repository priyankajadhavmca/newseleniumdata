package newselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkboxmultiple {

	static WebDriver driver;
	@Test
	public void checkboxdemo(){
		  System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://courses.letskodeit.com/practice");
			 driver.manage().window().maximize();
List<WebElement>checklist=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("total number of checkboxes"+checklist.size());

for(WebElement element:checklist){
	 element.click();
	boolean b1= element.isSelected();
	System.out.println(b1);
	driver.close();
}

	}
	
	
}
