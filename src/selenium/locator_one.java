package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_one {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUxODM3MjkyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
   WebElement fbgmail=driver.findElement(By.id("email"));
   fbgmail.sendKeys("sriramjr28@gmail.com");
   WebElement fbpas=driver.findElement(By.id("pass"));
    fbpas.sendKeys("12345678");
  // driver.navigate().to("https://www.instagram.com/?hl=en");
   //driver.findElement(By.id(""))
   
   
}
}
