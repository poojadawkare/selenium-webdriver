package firstProgramHomepage;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {

	public static void main(String[] args) {

		// public void dateTimePicker(){

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/");

		// Find the date time picker control

		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

		// Fill date as mm/dd/yyyy as 10/25/1994

		dateBox.sendKeys("10251994");

		// Press tab to shift focus to time field

		dateBox.sendKeys(Keys.TAB);

		// Fill time as 02:45 PM

		dateBox.sendKeys("0245PM");

		// }

	}

}