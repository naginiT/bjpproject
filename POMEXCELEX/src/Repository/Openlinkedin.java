package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openlinkedin {
public static WebDriver driver;
	
	public static void Browser() {
		
		 System.setProperty("webdriver.firefox.marionette", "C:\\Users\\NAGESHWARI\\Desktop\\Nageshwari files\\drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 
		   driver = new FirefoxDriver();
	}
		   public static void opeen() {
		driver.get("https://www.linkedin.com/");

	}
	public static void close() {
		driver.quit();
	}
	
}


