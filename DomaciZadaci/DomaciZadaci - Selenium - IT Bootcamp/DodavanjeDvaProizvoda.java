package testPaket;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DodavanjeDvaProizvoda {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement addToCartSamsung;
	WebElement addToCartApple;
	String samsungUrl = "https://www.demoblaze.com/prod.html?idp_=1";
	String appleUrl = "https://www.demoblaze.com/prod.html?idp_=11";

	public DodavanjeDvaProizvoda(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public String getSamsungUrl() {
		return samsungUrl;
	}

	public void setSamsungUrl(String samsungUrl) {
		this.samsungUrl = samsungUrl;
	}

	public String getAppleUrl() {
		return appleUrl;
	}

	public void setAppleUrl(String appleUrl) {
		this.appleUrl = appleUrl;
	}

	public WebElement getAddToCartSamsung() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
	}

	public WebElement getAddToCartApple() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
	}

	public void goToSamsungURL() {
		driver.navigate().to(samsungUrl);
	}

	public void clickAdtoCartSamsung() {
		getAddToCartSamsung().click();
	}

	public void goToAppleURL() {
		driver.navigate().to(appleUrl);
	}

	public void clickAdtoCartApple() {
		getAddToCartApple().click();
	}

	public void waiter(WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
