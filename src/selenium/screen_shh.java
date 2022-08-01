package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shh {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File Screen=ts.getScreenshotAs(OutputType.FILE);
	File screenn=new File("./shots/alert.png");
	FileHandler.copy(Screen, screenn);
	
	
}
}
