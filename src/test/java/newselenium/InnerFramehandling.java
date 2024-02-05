package newselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//first switch to the outeriframe do some action then switch to the inner iframe
public class InnerFramehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.automationtesting.in/Frames.html");
	   driver.manage().window().maximize();
	  
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	List<WebElement>list=driver.findElements(By.tagName("iframe"));
	System.out.println("total nuber of iframe "+list.size());
	   
	  WebElement outeriframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	  driver.switchTo().frame(outeriframe); //we are passing frame as webelement 
	  
	WebElement innerframe=driver.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);

	driver.findElement(By.xpath("//div[@class='row' ]//input[@type='text']")).sendKeys("rahul");
	driver.switchTo().parentFrame();
	String w=driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
	System.out.println("outerframe title"+w);
	
	//driver.quit();
	
	}

}
