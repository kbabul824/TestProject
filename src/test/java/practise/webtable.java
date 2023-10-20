package practise;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webtable extends Base {
	@Test
	public void crickbuzz() {
		int count = 0;
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.xpath("//div[@role='gridcell']"));
		System.out.println(driver.getTitle());
		
		driver.get("https://hdfcbank.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().isEmpty()) {
				System.out.println(links.get(i).getText().toString());
				links = driver.findElements(By.tagName("a"));
				count++;
			}
		}
		System.out.println("The total visible links are " + count);
		Assert.assertEquals(192, count,"coundt doesnt match");

	}
	}

