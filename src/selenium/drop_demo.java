package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://letcode.in/dropdowns");
		WebElement drop = driver.findElement(By.id("fruits"));
		Select sc = new Select(drop);
		sc.selectByValue("3");
		WebElement element = driver.findElement(By.id("superheros"));
		Select ss = new Select(element);
		ss.selectByIndex(28);
		ss.selectByValue("ta");
		ss.selectByVisibleText("Black Panther");
		WebElement lang = driver.findElement(By.id("lang"));
		Select se = new Select(lang);
		se.selectByIndex(4);
		List<WebElement> options = sc.getOptions();
		System.out.println(options);
		WebElement element2 = driver.findElement(By.id("country"));
		Select st=new Select(element2);
		st.selectByValue("India");
		System.out.println(st);

	}

}
