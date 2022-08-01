package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selan_loc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://en-gb.facebook.com/");
	 WebElement fbmail=driver.findElement(By.id("email"));
	 fbmail.sendKeys("sriramjr28@gmil.com");
	 WebElement fbpass = driver.findElement(By.id("pass"));
	fbpass.sendKeys("12345678");
	WebElement fblog = driver.findElement(By.name("login"));
  fblog.click();
  driver.get("https://en-gb.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUyMTkxMzU3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
  driver.navigate().to("https://www.instagram.com/?hl=en");
  WebElement instam = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	instam.sendKeys("sriramjr@gmail.com");
	WebElement instap = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	instap.sendKeys("12456789");
	WebElement instalg=driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]/button/div"));
	driver.quit();
}

}
