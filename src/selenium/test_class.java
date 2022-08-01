package selenium;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class test_class extends base_demo {
	public static void main(String[] args) throws AWTException {
		chrome_launch();
		//url("https://www.google.com", 25);
		url("https://www.amazon.in/", 20);
		WebElement web = byid("twotabsearchtextbox");
	keys(web, "iphone 13");
	//WebElement byx = byXpath("//input[@type='submit']");
	//keys2(byx);
		
		//url("https://demoqa.com/alerts", 25);
		//WebElement byid = byid("confirmButton");
		//keys2(byid);
		//alerrd(driver);
		//WebElement byXpath1 = byXpath("//button[@id='promtButton']");
		//keys2(byXpath1);
		//alerrs(driver,"ok");
		//alerrd(driver);
		//url("https://letcode.in/dropdowns", 25);
		//WebElement byid = byid("fruits");
		//value(byid, "3");
		//WebElement first = first(byid);
		//String don = text(byid ,"3");
		//System.out.println(first);
		//quit();
		//url("http://automationpractice.com/index.php", 30);
	   //byxp("(//a[@title='T-shirts'])[2]");
	   //act1(driver);
	//windo();
	//windo();
	//windo1();
	windo2();
	screen("./sc_shot/after.png");
	}

}
