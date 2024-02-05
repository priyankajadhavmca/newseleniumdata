package basicseleniumprac;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownhandlingusingwebelements {
  
		static WebDriver driver;
   
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250)","");
	
		//String countryxapth="//select[@name='country']//option";
		//SelDvalue(countryxapth,"BOLIVIA");   //call genric method	
		//}
	//public static void SelDvalue(String xpathvalue,String value){// create genric method
	
			
		List<WebElement>contrylists=driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println("Total country size is"+contrylists.size());
		
//		Iterator<WebElement>ele=contrylists.iterator();
//		while(ele.hasNext()){
//		WebElement val=	ele.next();
//		System.out.println(val);
//		
//		}
//		
		for(int i=0;i<contrylists.size();i++){
			System.out.println(contrylists.get(i).getText());
			if(contrylists.get(i).getText().equals("BOLIVIA")){
				contrylists.get(i).click();
				break;
			}
		}
		driver.close();
  }

}
