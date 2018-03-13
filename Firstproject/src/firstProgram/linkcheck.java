package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:/www.TheLostBugs.com");

		java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));//To count the total links
		System.out.println("Total no links are:" + Links.size());

		for (int i = 1; i <= Links.size(); i = i + 1)

		{
			System.out.println(Links.get(i).getText());
		}

	}

}
