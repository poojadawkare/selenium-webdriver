package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formcheck {

	public static void main(String[] args) {

		// To get property of ChromeDriver

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-form/");

		// To check the partial link test

		WebElement link = driver.findElement(By.partialLinkText("Partial Link Test"));
		link.click();

		System.out.println("partial link test pass!!");

		WebElement link1 = driver.findElement(By.linkText("Link Test"));
		link1.click();

		// To check link text

		System.out.println("link test pass!!");

		driver.navigate().back();

		// To get the website title
		System.out.println(driver.getTitle());

		WebElement text = driver.findElement(By.name("firstname"));
		text.sendKeys("pooja");

		System.out.println("first name test pass!!");

		WebElement name = driver.findElement(By.name("lastname"));
		name.sendKeys("dawkare");

		System.out.println("last name test pass!!");

		WebElement radio1 = driver.findElement(By.id("sex-0"));
		radio1.click();

		WebElement checkbox = driver.findElement(By.id("profession-0"));
		checkbox.click();

		System.out.println("checckbox is passed!!");

		WebElement checkbox1 = driver.findElement(By.id("profession-1"));
		checkbox1.click();

		System.out.println("checkbox1 is passed !!");

		WebElement upload = driver.findElement(By.id("photo"));
		upload.sendKeys("E:\\p.JPG");

		System.out.println("upload is passed!!");

		WebElement checkbox2 = driver.findElement(By.id("tool-0"));
		checkbox2.click();

		System.out.println("checckbox2 is passed!!");

		WebElement checkbox3 = driver.findElement(By.id("tool-1"));
		checkbox3.click();

		System.out.println("checckbox3 is passed!!");

		WebElement checkbox4 = driver.findElement(By.id("tool-2"));
		checkbox4.click();

		System.out.println("checckbox4 is passed!!");

		WebElement Date = driver.findElement(By.id("datepicker"));
		Date.sendKeys("25/10/1994");

		System.out.println("Date is passed!!");

		WebElement YearOfExperience = driver.findElement(By.id("exp-0"));
		YearOfExperience.click();

		System.out.println("Yearofexperience is passed!!");

		Select DrpContinets = new Select(driver.findElement(By.id("continents")));
		DrpContinets.selectByVisibleText("Africa");

		Select seleniumcommands = new Select(driver.findElement(By.id("selenium_commands")));
		
		seleniumcommands.selectByIndex(3);
		seleniumcommands.selectByIndex(2);

		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		
		System.out.println("log in successfully!!");
		
		
		
		
		

	}

}