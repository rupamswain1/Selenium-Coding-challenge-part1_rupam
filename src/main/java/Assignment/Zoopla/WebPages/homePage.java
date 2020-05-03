package Assignment.Zoopla.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment.Zoopla.BrowserDriver.Driver;
import Assignment.Zoopla.ReadProperty.ReadPropertyFile;

public class homePage {
	
	//Object Declaration of required elements in Page
	
	@FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	WebElement acceptCookieButton;
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement locationSearchBox;
	
	@FindBy(xpath="//button[@id='search-submit']")
	WebElement searchButton;
	
	
	public homePage()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	
	//Below function will Search the Location
	public PropertyForSale searchLocation()
	{
		String location=ReadPropertyFile.readProperty("Location");
		acceptCookieButton.click();
		locationSearchBox.sendKeys(location);
		searchButton.click();
		
		return new PropertyForSale();
	}

}
