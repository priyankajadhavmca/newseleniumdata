package basicseleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		 driver.manage().window().maximize();
		 WebElement seloption=driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
		 
		
		 Select select=new Select(seloption);
		
	       select.selectByVisibleText("Apple");
	       select.selectByVisibleText("Orange");
	       select.selectByVisibleText("Peach");
	       Thread.sleep(2000);
	       
	       //*********************ismultiple********************
	       boolean b1= select.isMultiple();
			System.out.println("dropdown support multiselect value"+b1);
	       
	       List<WebElement>seloptions=select.getAllSelectedOptions();
	
	       for(WebElement ele:seloptions){
	            String value= ele.getText();
	            System.out.println(value);
	       }
                  driver.close();
	}
                      
}
