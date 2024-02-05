package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ity {

	static WebDriver driver;
	@Test
	public void handlemultiplewindow() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/browser-windows");
        
        driver.findElement(By.id("windowButton")).click();
        String mainwindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
                if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                
                WebElement text = driver.findElement(By.id("sampleHeading"));
                //driver.navigate().refresh(); //get stalelement reference exception
                System.out.println("Heading of child window is " + text.getText()); 
                driver.close();
                System.out.println("Child window closed");
            }
        }    
	}

}
