package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class base_demo {
	private static final String Action = null;
	public static WebDriver driver;

	public static void chrome_launch() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void edge_launch() {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	public static void url(String urll, long seconds) {
		driver.get(urll);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static WebElement byid(String idd) {
		return driver.findElement(By.id(idd));

	}

	public static WebElement byname(String name) {
		return driver.findElement(By.name(name));

	}

	public static WebElement byXpath(String bye) {
		return driver.findElement(By.xpath(bye));
	}

	public static List<WebElement> byid1(String hii) {
		return driver.findElements(By.id(hii));

	}

	public static List<WebElement> byname1(String nan) {
		return driver.findElements(By.name(nan));
	}

	public static List<WebElement> byxp(String nun) {
		return driver.findElements(By.xpath(nun));

	}

	public static void keys(WebElement type, String value) {
		type.sendKeys(value);
	}

	public static void keys2(WebElement tape) {
		tape.click();
	}

	public static void keyss(WebElement top) {
		top.clear();
	}

	public static void alerrt(WebDriver ale) {
		ale.switchTo().alert().accept();

	}

	public static void alerrd(WebDriver aler) {
		aler.switchTo().alert().dismiss();

	}

	public static void alerrs(WebDriver ales, String ok) {
		ales.switchTo().alert().sendKeys(ok);

	}

	public static void drop(WebElement dro, int no) {
		Select sc = new Select(dro);
		sc.selectByIndex(no);

	}

	public static void value(WebElement droi, String val) {
		Select se = new Select(droi);
		se.selectByValue(val);
	}

	public static void visible(WebElement droiw, String visi) {
		Select se = new Select(droiw);
		se.selectByVisibleText(visi);
	}

	public static WebElement first(WebElement fir) {
		Select st = new Select(fir);
		return st.getFirstSelectedOption();

	}

	public static String text(WebElement fox, String fix) {
		return fox.getText();

	}

	public static void act1(WebDriver decc) {
		Actions at = new Actions(decc);
		at.doubleClick().perform();
	}

	public static void act2(WebDriver dea,WebElement element) {
		Actions ai = new Actions(dea);
		ai.contextClick(element).perform();
	}

	 public static void act3(WebDriver des,WebElement mm) {
	 Actions ao=new Actions(des);
	 ao.moveToElement(mm).perform();
	 }
	public static void windo() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void windo1() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_KP_UP);
	}

	public static void windo2() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void screen(String hhh) {
		TakesScreenshot sh = (TakesScreenshot) driver;
		File screenshotAs = sh.getScreenshotAs(OutputType.FILE);
		File sc_shot = new File(hhh);
		try {
			FileHandler.copy(screenshotAs, sc_shot);
		} catch (Exception j) {
			j.printStackTrace();
		}

	}

	public static void quit() {
		driver.quit();
	}

}
