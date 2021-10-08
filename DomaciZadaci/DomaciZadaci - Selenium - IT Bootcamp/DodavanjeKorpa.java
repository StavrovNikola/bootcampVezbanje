package testPaket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DodavanjeKorpa {

	WebDriver driver;
	WebDriverWait wdait;
	WebElement addToCart;
	String phoneURL = "https://www.demoblaze.com/prod.html?idp_=4#";

	public DodavanjeKorpa(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wdait = wait;
	}

	public String getPhoneURL() {
		return phoneURL;
	}

	public WebElement getAddToCart() {
		return driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
	}
	
	public void setPhoneURL(String phoneURL) {
		this.phoneURL = phoneURL;
	}
	
	public void goToPhoneURL () {
		driver.navigate().to(phoneURL);
	}
	
	public void clickAddToCart () {
		getAddToCart().click();
	}
	public void waiter (WebElement element) {
		wdait.until(ExpectedConditions.elementToBeClickable(element));

}
}