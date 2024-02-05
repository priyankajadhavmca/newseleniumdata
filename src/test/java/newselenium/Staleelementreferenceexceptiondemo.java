package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleelementreferenceexceptiondemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("cxvcxvx");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.navigate().back();
		ele.clear();
		driver.close();
		
	
	}

}
