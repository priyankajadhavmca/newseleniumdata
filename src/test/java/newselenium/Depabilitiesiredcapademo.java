package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Depabilitiesiredcapademo {

	public static void main(String[] args) {
		
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        
        System.setProperty("webdriver.ie.driver","F:\\Selenium Software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
    
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		 driver.findElement(By.name("btnG")).sendKeys(Keys.RETURN);
		  
//		 String title= driver.getTitle();
//		 System.out.println(title);
//	
	}

}
