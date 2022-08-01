package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("http://automationpractice.com/index.php");
		TakesScreenshot Screenshot=(TakesScreenshot) driver;
		File source = Screenshot.getScreenshotAs(OutputType.FILE);
		File desig=new File("C:\\Users\\srira\\eclipse-workspace\\selenium\\screenn\\img.png");
		FileHandler.copy(source, desig);
		driver.quit();
	}

}
