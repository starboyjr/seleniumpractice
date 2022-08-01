package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://automationpractice.com/index.php");
		WebElement woment = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(woment).perform();
WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
builder.contextClick(tshirt).perform();
	}

}
