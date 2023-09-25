package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class crmBot extends Base{
@Test
public void Tester()
{
	driver.get("https://www.crmpro.com/index.html");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//*[@id='intercom-container']/div/div[1]/iframe"));
	Actions action=new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//*[@contains(text,'Sign up the team and get started')]"))).build().perform();
	//driver.findElement(By.xpath("//*[@id='intercom-container']/div/div/div[1]/div/div/span")).click();
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("Babul007");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("9700241187");
}

}
