package Assignment.Zoopla.BrowserDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignment.Zoopla.ReadProperty.ReadPropertyFile;

public class Driver extends ReadPropertyFile
{
	public static WebDriver driver=null;
	//This class will open google chrome, maximise it and open website
	private Driver()
	{
		
		try
		{
			ReadPropertyFile read =new ReadPropertyFile();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src//main//resources//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(read.readProperty("url"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialize()
	{
		Driver d=new Driver();
	}
	
}