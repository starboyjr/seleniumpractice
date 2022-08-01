package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\srira\\eclipse-workspace\\selenium\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		

	}

}
