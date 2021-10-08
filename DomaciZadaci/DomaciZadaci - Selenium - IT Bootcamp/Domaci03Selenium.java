package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DomaciYoutube {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "driver-lib\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(5000);
	
		
		WebElement searchButton = driver.findElement(By.name("search_query"));
		searchButton.click();
		searchButton.clear();
		searchButton.sendKeys("rick astley never gonna give you up");
		searchButton.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement firstSong = driver.findElement(By.cssSelector(".style-scope.ytd-video-renderer"));
		firstSong.click();
		Thread.sleep(2000);
		
		WebElement secondSong = driver.findElement(By.cssSelector(".style-scope.ytd-compact-video-renderer"));
		secondSong.click();
		
		driver.close();
		
		
		
	}

}
