package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix_prime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/login");
		WebElement netm=driver.findElement(By.id("id_userLoginId"));
		netm.sendKeys("messisriram@gmail.com");
		WebElement netpas = driver.findElement(By.name("password"));
		netpas.sendKeys("12345678");
		WebElement netl = driver.findElement(By.xpath("//button[@type='submit']"));
		netl.click();
		//driver.navigate().to("https://www.hotstar.com/in");
		//WebElement hotp=driver.findElement(By.id("phoneNo"));
		//hotp.sendKeys("9876543210");
		driver.quit();
		
	}

}
