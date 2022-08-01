package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/windows");
		String windowHandle = driver.getWindowHandle(); // current windowhandle
		System.out.println("first window :" + windowHandle);
		driver.findElement(By.id("home")).click();
		// System.out.println(driver.getCurrentUrl());
		String homepage = driver.getCurrentUrl();
		System.out.println("homepage url :" + homepage);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("home page :" + windowHandles);
		System.out.println(driver.getCurrentUrl());
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(" navigated page :" + driver.getCurrentUrl());
		driver.quit();

	}
}
