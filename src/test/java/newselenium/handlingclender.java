package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingclender {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
			//WebElement ele= driver.findElement(By.xpath("//li[@id='Simple Date Picker']"));
			//Actions act=new Actions(driver);
			//act.moveToElement(ele).click().perform();
			driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
			
	}

}
