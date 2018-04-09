package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inspectlinkedin extends Openlinkedin {
	
	static By user=By.id("login-email");
	static By pswd=By.name("session_password");
	static By Btn=By.id("login-submit");
	
	/*public Inspectlinkedin(WebDriver driver) {
		super();
	}*/
	
	public static WebElement user() {
		return driver.findElement(user);
	}
		public static WebElement pswd() {

		return driver.findElement(pswd);
	}
	
	public static WebElement submit() {
		return driver.findElement(Btn);
	}
	
}


