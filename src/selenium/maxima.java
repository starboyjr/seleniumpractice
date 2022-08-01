package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxima {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srira\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.netflix.com/browse");
	
	driver.navigate().to("https://www.youtube.com/");
	
	driver.navigate().forward();
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	driver.manage().window().minimize();
	
	driver.quit();
	
}
}
