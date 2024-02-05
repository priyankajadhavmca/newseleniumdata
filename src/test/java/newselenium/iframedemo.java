package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement framecount=driver.findElement(By.tagName("iframe"));
		System.out.println("frame count is"+framecount);
	   
	   
	   driver.switchTo().frame("iframeResult");
		
		WebElement innerframe=driver.findElement(By.xpath("//*[@title='Iframe Example']"));
		driver.switchTo().frame(innerframe); //pass webelement as frame switch toinner frame
	
		System.out.println("The text present inside the inner frame is "+ driver.findElement(By.xpath("//h1")).getText());
	
	driver.switchTo().parentFrame(); //goto parent frame/outerframe
	
	String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
	 System.out.println("text present inside the outerframe"+text);
	}
	

}
