package testPaket;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest1 {

	public static WebDriver driver;
	public static LoginStranica loginStranica;
	public LogoutStranica logoutStranica;
	public DodavanjeKorpa dodavanjeKorpa;
	public BrisanjeKorpa brisanjeKorpa;
	public ExcelReader excelReader;
	public static WebDriverWait wdwait;
	
	@BeforeClass
	public void setUp() throws IOException {

		System.setProperty("webdriver.gecko.driver", "driver-lib\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		loginStranica = new LoginStranica(driver, wdwait);
		logoutStranica = new LogoutStranica(driver);
		dodavanjeKorpa = new DodavanjeKorpa(driver, wdwait);
		brisanjeKorpa = new BrisanjeKorpa(driver, wdwait);
		excelReader = new ExcelReader("C:/Users/stavr/Desktop/IT Bootcamp/Apache POI/data.xlsx");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
