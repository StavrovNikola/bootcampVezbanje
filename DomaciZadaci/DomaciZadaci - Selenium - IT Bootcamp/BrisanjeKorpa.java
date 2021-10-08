package testPaket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrisanjeKorpa {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement deleteFromCart;
	String cartURL = "https://www.demoblaze.com/cart.html";
	public BrisanjeKorpa(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}
	public String getCartURL() {
		return cartURL;
	}
	public void setCartURL(String cartURL) {
		this.cartURL = cartURL;
	}
	public WebElement getDeleteFromCart() {
		return driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a"));
	}
	public void goToCartURL () {
		driver.navigate().to(cartURL);
	}
	public void clickToDelete () {
		getDeleteFromCart().click();
	}
	public void waiter (WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
}
}

