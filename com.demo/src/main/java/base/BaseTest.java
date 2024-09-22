package base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
	public static WebDriver driver;
	
@BeforeMethod
	public void browserConfig() throws Exception  {
		ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("128");
		driver=new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);     --implicitly wait applies to allnelement
		driver.manage().window().maximize();
	    Properties prop=new Properties();
	    FileInputStream fis= new FileInputStream("C:\\Users\\w135220\\eclipse-workspace\\com.demo\\src\\main\\java\\config\\config.properties");
	    prop.load(fis);
	    driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

}
