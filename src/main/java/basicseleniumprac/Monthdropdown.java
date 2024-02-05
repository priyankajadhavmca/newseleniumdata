package basicseleniumprac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monthdropdown {
 static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/r.php?locale=en_GB");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	  
	   //String month_xpath= "//select[@id='month']//option";
	   
	   selectdropvalue("jan");    //got exception nullpointer exception
	}
	   public static void selectdropvalue(String value){
		  List<WebElement>monthlist= driver.findElements(By.xpath("//select[@id='month']//option"));
			System.out.println(monthlist.size());
			for(int i=0;i<monthlist.size();i++){
				System.out.println(monthlist.get(i).getText());
				if(monthlist.get(i).getText().equals(value)){
				monthlist.get(i).click();
				break;
			}}
	
	
	}}