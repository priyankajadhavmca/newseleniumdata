package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifrmae2demo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");
		driver.manage().window().maximize();
		//1st frame
	   driver.switchTo().frame("packageListFrame");
	   driver.findElement(By.xpath("//ul[@title='Packages']//a[text()='org.openqa.selenium']")).click();
	   driver.switchTo().defaultContent();
   Thread.sleep(3000);
	   
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='leftBottom']//iframe[@name='packageFrame']"));
	   driver.switchTo().frame(ele);
	   //driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]")).click();
	   driver.findElement(By.xpath("//a[@href='HasCdp.html']//span")).click();
	   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("rahul");
	   driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   driver.close();
	   
	   
	}

}
