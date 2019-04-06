package Assignment.Zoopla.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment.Zoopla.BrowserDriver.Driver;

public class agentPage {

	@FindBy(xpath="//div[@id='content']//h1/b[1]")
	WebElement agentName;
	
	public agentPage()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	//Fetch Agent name from page
	public String getAgentName()
	{
		return agentName.getText();
		
	}
	
}
