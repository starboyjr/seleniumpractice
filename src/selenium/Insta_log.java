package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_log {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.name("username")).sendKeys("qwertyuert");
	driver.findElement(By.name("password")).sendKeys("qwerterty");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}
