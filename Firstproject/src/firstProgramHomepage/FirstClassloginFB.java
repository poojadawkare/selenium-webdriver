package firstProgramHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClassloginFB {

	public static void main(String[] args) {

		// To get property of ChromeDriver

		// System.setProperty("webdriver.gecko.driver","C:\\ProgramFiles\\Java\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// instance of ChromeDriver

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// To go FacebookandgmailHomepage
		// driver.get("http://www.facebook.com");
		// driver.get("http://www.gmail.com");

		// String baseUrl = ("http://thelostbugs.com/");

		String baseUrl = ("https://www.facebook.com/thelostbugs/");

		// ("http://thelostbugs.com/wp-content/plugins/wordpress-social-login/assets/img/32x32/wpzoom/facebook.png");
		// String baseUrl = ("http://thelostbugs.com/register/");

		driver.get(baseUrl);

		String actualTitle = "";
		String expectedTitle = ("TheLostBugs.com | TheLostBugs.com");

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");

		}

		// To get the WebsiteTitle
		System.out.println(driver.getTitle());

		// facebooklogin

		WebElement email = driver.findElement(By.name("email"));

		email.sendKeys("poodawkare@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("poojadawkare@123");

		WebElement login = driver.findElement(By.id("u_0_3"));
		login.click();
		
		
		String mainPage = null;
		driver.switchTo().window(mainPage);

		// gmail Login

		// WebElement email = driver.findElement(By.id("identifierId"));
		// email.sendKeys("poodawkare@gmail.com");

		// String tagName = "";

		// tagName = driver.findElement(By.id("email")).getTagName();

		// System.out.println(tagName);

		// driver.close();

	}

}
