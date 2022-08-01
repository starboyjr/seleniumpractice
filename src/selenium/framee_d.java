package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framee_d {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/frame.html");
//		WebElement element = driver.findElement(By.xpath("//iframe[@src='default.html']"));
//		driver.switchTo().frame(element);
//		WebElement element2 = driver.findElement(By.xpath("//button[@id='Click']"));
//		element2.click();
//		WebElement element3 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
//		driver.switchTo().frame(element3);
//		WebElement element4 = driver.findElement(By.xpath("//iframe[@id='frame2'][@src='nested.html']"));
//		driver.switchTo().frame(element4);
//		WebElement element5 = driver.findElement(By.xpath("//button[@id='Click1']"));
//		element5.click();
	System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		
		
   }
}