package basicseleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtablehandlingusingsplit {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250)","");
		
		Select sel=new Select(driver.findElement(By.name("country")));
		//sel.selectByVisibleText("AMERICAN SAMOA");
		
		
		List<WebElement>countrylist=sel.getOptions();   //it will print all the options in the dropdown
		System.out.println("Total country"+countrylist.size());
		
		for (int i=0;i<countrylist.size();i++){
			String countryvalue=countrylist.get(i).getText();
			System.out.println(countryvalue);
			if(countryvalue.equals("AMERICAN SAMOA")){ // if the country is AMERICAN SAMOA then select the valuen and click
				countrylist.get(i).click();  //if my condition is satisfised then break the loop
				break;
			}
			
		}
	
//driver.close();	
	
		
		}}