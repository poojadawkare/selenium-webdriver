package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class Gmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Java\\geckodriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.gmail.com");


		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("poodawkare@gmail.com");
		
		
		
		
		
		WebElement button = driver.findElement(By.("ZFr60d CeoRYc"));
		button.click();
		
		
	
		
		
		//Select drpCountry = new Select(driver.findElement(By.name("Country")));
		//drpCountry.selectByVisibleText("Dansk");

		//drpCountry.selectByIndex(1);
		
		
	

		// WebElement RveJvdsnByac = driver.findElement(By.name("Next"));
		// RveJvdsnByac.sendKeys("Next");
		// RveJvdsnByac.click();
		
		
		
		
		
		//driver.findElement(By.linkText("Forgot Email?")).click();
		
		//System.out.println("title of page is: " + driver.getTitle());
		
		
		

	}

}
