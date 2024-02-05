package newselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
		Alert alert=driver.switchTo().alert();
		String alertmsg=alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		if(alertmsg.equals("Press 'OK' or 'Cancel' button!")){
			System.out.println(" pressed ok button");
		}
		else{
			System.out.println("pressed cancel button");
		
		}
Thread.sleep(2000);
		driver.close();
	}

}
