package DynamicWebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificrow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		
	//List<WebElement>specifiCROWVAL=driver.findElements(By.xpath("//table[@id='customers']//tr[4]"));//4 ROW val print
		
	List<WebElement>specificcolcount=driver.findElements(By.xpath("//table[@id='customers']//td[4]"));//4 col val print
	System.out.println(specificcolcount);
	for(WebElement ele:specificcolcount){
		String val=ele.getText();
		System.out.println(val);
		
		
	}
        

	}

}
