package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@org.testng.annotations.Test()
	public void ChromeRunner() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kbabul67@yopmail.com");
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("baba string is value value is string " + value);

	}

}
