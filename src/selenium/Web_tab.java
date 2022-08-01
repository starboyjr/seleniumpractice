package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tab {
	// web table--->table
	          //      tr--->row
	        //        th--->subheading
	      //          td---->data
	            public static void main(String[] args) {
					System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.w3schools.com/html/html_tables.asp");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
					List<WebElement>heading=driver.findElements(By.xpath("//table[@id='customers']//td[.='Roland Mendel']//following-sibling::td"));
					WebElement ccc = heading.get(0);
					System.out.println("tne no of:"+ccc);
					//System.out.println(heading.get(9));
					driver.quit();
				}    

}
