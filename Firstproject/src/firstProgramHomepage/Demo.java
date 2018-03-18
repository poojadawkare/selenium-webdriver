package firstProgramHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\ProgramFiles\\Java\\geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("poodawkare@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("poojadawkare@123");

		WebElement link1 = driver.findElement(By.linkText("Forgotten account?"));
		link1.click();

		driver.navigate().back();

		// WebElement LogIn = driver.findElement(By.id("u_0_2"));
		// LogIn.click();

		// driver.navigate().back();

		WebElement text = driver.findElement(By.name("firstname"));
		text.sendKeys("pooja");

		WebElement inputtext = driver.findElement(By.name("lastname"));
		inputtext.sendKeys("dawkare");

		WebElement inputtext_58mg_5dba_2ph = driver.findElement(By.name("reg_email__"));
		inputtext_58mg_5dba_2ph.sendKeys("poodawkare@gmail.com");

		WebElement Reenteremailaddress = driver.findElement(By.id("u_0_t"));
		Reenteremailaddress.sendKeys("poodawkare@gmail.com");

		WebElement Newpassword = driver.findElement(By.id("u_0_x"));
		Newpassword.sendKeys("poojadawkare@123");

		WebElement radio1 = driver.findElement(By.id("u_0_b"));
		radio1.click();

		Select DrpBirthday = new Select(driver.findElement(By.id("day")));
		DrpBirthday.selectByVisibleText("25");

		Select DrpBirthday1 = new Select(driver.findElement(By.id("month")));
		DrpBirthday1.selectByVisibleText("Oct");

		Select DrpBirthday2 = new Select(driver.findElement(By.id("year")));
		DrpBirthday2.selectByVisibleText("1994");

		System.out.println("Birthday successfully");

		WebElement websubmit = driver.findElement(By.id("u_0_13"));
		websubmit.click();

	}

}
