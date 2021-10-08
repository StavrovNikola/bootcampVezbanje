package testPaket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStranica {

	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton1;
	WebElement loginButton2;
	public WebDriverWait wdwait;

	public LoginStranica(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getLoginButton1() {
		return driver.findElement(By.id("login2"));

	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("loginusername"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("loginpassword"));
	}

	public WebElement getLoginButton2() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
	}
	
	public void pressLoginButton1 () {
		this.getLoginButton1().click();
	}
	public void insertUsername (String usernameData) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(usernameData);
	}
	public void  insertPassword (String passwordData) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(passwordData);
	}
	public void pressLoginButton2 () {
		this.getLoginButton2().click();
	}
	
	public void waiter (WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}

	/*
	 * ovde mozes da stavis za web driver wait posle 
	 * */