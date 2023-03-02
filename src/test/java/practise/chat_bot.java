package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chat_bot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JARZ\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		List<WebElement> bot=driver.findElements(By.xpath("//b[contains(text(),'X')]"));
		System.out.println("bot found");
		if(bot.size()>0) {
			bot.get(0).click();
			System.out.println("bot clicked");
		}
	}

}
