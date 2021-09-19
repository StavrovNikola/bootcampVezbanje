package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium01Domaci {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "driver-lib\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		
		String username = "student";

		String password = "Password123";

		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

		WebElement usernameInput = driver.findElement(By.id("username"));

		usernameInput.clear();

		usernameInput.sendKeys(username);

		WebElement passInput = driver.findElement(By.id("password"));

		passInput.clear();

		passInput.sendKeys(password);

		WebElement submitButton = driver.findElement(By.id("submit"));

		submitButton.click();		

		WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));

		logOutButton.click();
	
		driver.close();
	}

	}

