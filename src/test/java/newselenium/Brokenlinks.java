package newselenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gooogle.com/");
		driver.manage().window().maximize();
		List<WebElement>link=driver .findElements(By.tagName("a"));
		System.out.println("Total number of links"+link.size());
		for(int i=0;i<link.size();i++){
			WebElement element=link.get(i);
			String urlattribute=element.getAttribute("href");
			URL url=new URL(urlattribute);
			HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
			httpconn.connect();
			int responsecode=httpconn.getResponseCode();
			if(responsecode>=400){
				System.out.println(url  +"   "+"Broken link");
			}
			else{
				System.out.println(url  +" "+"its Valid link");
			}
		}
		driver.close();
		
	}

}
