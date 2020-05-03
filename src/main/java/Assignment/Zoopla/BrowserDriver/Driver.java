package Assignment.Zoopla.BrowserDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Assignment.Zoopla.Listners.EventHandler;
import Assignment.Zoopla.ReadProperty.ReadPropertyFile;

public class Driver extends ReadPropertyFile
{
	public static WebDriver driver=null;
	
	//This class will open google chrome, maximise it and open website
	private Driver()
	{
		
		try
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src//main//resources//chromedriver.exe");
			driver=new ChromeDriver();
			EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
			EventHandler handler=new EventHandler();
			eventDriver.register(handler);
			driver=eventDriver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(ReadPropertyFile.readProperty("url"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialize()
	{
		new Driver();
	}
	
	public static void quit()
	{
		driver.quit();
	}
	
}
