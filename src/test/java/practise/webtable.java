package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class webtable extends Base{
	@Test
	public void crickbuzz()
	{
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		List<WebElement> row=driver.findElements(By.xpath("//div[@role='gridcell']"));
		String name="7889890912";
		for(int i=0;i<row.size();i++)
		{
			String data=row.get(i).getText().toString();
			if(data.contains(name))
			{
				System.out.println(row.get(i).getText().toString());
			}
		}
		
	}

}
