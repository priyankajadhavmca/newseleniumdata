package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenfiledvaluejs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
        driver.findElement(By.id("hide-textbox")).click();
        JavascriptExecutor js=( JavascriptExecutor)driver;
      String value= js.executeScript("return document.getElementById('hide-textbox').getAttribute('value')").toString();
	System.out.println("Hidden filed value is "+value);
	
	driver.close();
	}

}
