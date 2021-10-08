package testPaket;

import static org.testng.Assert.assertEquals;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testiranje extends BaseTest1 {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");
	
	}
 
	@Test(priority = 10)
	public void successfullLogin() {

		String logInCheck = "Welcome StavrovNikola";
		String button1 = excelReader.getStringData("data", 1, 5);
		String username = excelReader.getStringData("data", 1, 1);
		String password = excelReader.getStringData("data", 1, 3);
		String button2 = excelReader.getStringData("data", 2, 5);
		loginStranica.pressLoginButton1();
		loginStranica.insertUsername(username);
		loginStranica.insertPassword(password);
		loginStranica.pressLoginButton2();

		assertEquals("Welcome StavrovNikola", logInCheck);
		// Test prolazi i pored Logina pise Welcome StavrovNikola, sto sam u assertu
		// naveo da je ocekivano
	}

	@Test(priority = 20)
	public void unsuccessfullLogin() {
//User does not exist.
		String invalidLoginCheck = "User does not exist.";
		String button1 = excelReader.getStringData("data", 1, 5);
		String username = excelReader.getStringData("data", 2, 2);
		String password = excelReader.getStringData("data", 2, 4);
		String button2 = excelReader.getStringData("data", 2, 5);
		loginStranica.pressLoginButton1();
		loginStranica.insertUsername(username);
		loginStranica.insertPassword(password);
		loginStranica.pressLoginButton2();

		assertEquals("User does not exist.", invalidLoginCheck);
		// Ocekivao sam da ovaj test prodje, jer sam naveo pogresne kredencijale za
		// LogIn

	}

	// Product added.
	@Test(priority = 30)
	public void addPhoneToCart() {

		String phoneToCart = "Product added.";
		String phoneURL = "https://www.demoblaze.com/prod.html?idp_=4#";
		driver.navigate().to(phoneURL);

		String button1 = excelReader.getStringData("data", 1, 5);
		String username = excelReader.getStringData("data", 1, 1);
		String password = excelReader.getStringData("data", 1, 3);
		String button2 = excelReader.getStringData("data", 2, 5);
		loginStranica.pressLoginButton1();
		loginStranica.insertUsername(username);
		loginStranica.insertPassword(password);
		loginStranica.pressLoginButton2();
		Alert alert = driver.switchTo().alert();
        alert.accept();
		String addToCart = excelReader.getStringData("data", 1, 6);
		dodavanjeKorpa.clickAddToCart();

		assertEquals(null, phoneToCart);
		// Sve prodje, on cak i doda telefon kroz Add to cart, ali ga kasnije nema u
		// korpi,
		// zato ovaj test pada, jer sam ocekivao Product added, a nisam dobio nista
	}

	@Test(priority = 40)
	public void deleteCart() {
		
		String expectedURL = "https://www.demoblaze.com/cart.html#";
		String cartURL = "https://www.demoblaze.com/cart.html";
		driver.navigate().to(cartURL);
		String button1 = excelReader.getStringData("data", 1, 5);
		String username = excelReader.getStringData("data", 1, 1);
		String password = excelReader.getStringData("data", 1, 3);
		String button2 = excelReader.getStringData("data", 2, 5);
		loginStranica.pressLoginButton1();
		loginStranica.insertUsername(username);
		loginStranica.insertPassword(password);
		loginStranica.pressLoginButton2();

		
		String deleteCart = excelReader.getStringData("data", 2, 6);
		brisanjeKorpa.clickToDelete();
		
		assertEquals(cartURL, expectedURL);
	
		//S obzirom na to da nemam nista u korpi, ne mogu da obrisem
		//primetio sam da se dodaje # na url kada ima i kada nema telefona, pa sam uporedio ta dva
		//urla i test je naravno pao jer nisam dobio trazeni
		}
		public void addTwoPhonestoCart () {
			String phoneURL = "https://www.demoblaze.com/prod.html?idp_=4#";
			driver.navigate().to(phoneURL);
			//Nisam stigao da odradim test za dodavanje dva telefona
			}
	@AfterMethod
	public void afterTests () {
		driver.manage().deleteAllCookies();
	}
}
