package firstProgramHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver","C:\\ProgramFiles\\Java\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// instance of ChromeDriver

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		driver.get("http://thelostbugs.com/register/");

		WebElement username = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[1]/div[2]/input"));

		username.sendKeys("poojaD");

		WebElement pass = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[2]/div[2]/input"));

		pass.sendKeys("poojadawkare@1234");

		WebElement cpass = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[3]/div[2]/input"));

		cpass.sendKeys("poojadawkare@1234");

		WebElement fname = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[4]/div[2]/input"));

		fname.sendKeys("pooja");

		WebElement lname = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[5]/div[2]/input"));

		lname.sendKeys("dawkare");

		WebElement mail = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[6]/div[2]/input"));

		mail.sendKeys("poodawkare@gmail.com");

		WebElement mobno = driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[7]/div[2]/input"));

		mobno.sendKeys("8421261775");

		Select Drplist = new Select(driver.findElement(
				By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/div[2]/div[8]/div[2]/div/select")));
		Drplist.selectByVisibleText("Iceland");

		WebElement signup = driver
				.findElement(By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/form/input[2]"));
		signup.click();

	}

}
