package practise;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public static WebDriver driver=null;
	ChromeOptions options;
	@BeforeClass
	public void setUp() {
		options = new ChromeOptions();
		
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--window-size=1024*768");
		options.addArguments("start-maximized");
		options.setHeadless(true);
		
		if(driver==null)
		if(System.getProperty("os.name").contains("Window")){
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			 
		}else {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver");
			driver = new ChromeDriver(options);
			
			
		}
		//options.addArguments("--disable-dev-shm-usage");
		//options.addArguments("--window-size=1024*768");
		//options.addArguments("start-maximized");
		
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
