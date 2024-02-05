package newselenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlemultiple {
    static WebDriver driver;
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/live");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id"+parent);
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("total window are"+allwindow);
		
}}
