package testPaket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutStranica {

	WebDriver driver;
	WebElement logOutButton;

	public LogoutStranica(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getLogoutButton () {
		return driver.findElement(By.id("logout2"));
	}
	public void pressLogOutButton () {
		this.getLogoutButton().click();
	}
}
