package Assignment.Zoopla.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment.Zoopla.BrowserDriver.Driver;

public class fifthProperty {
	
	@FindBy(xpath="//div[@class='ui-agent__logo']/img[@class='js-lazy-loaded']")
	WebElement agentLogo;
	
	@FindBy(xpath="//div[@class='dp-sidebar-wrapper__contact']//div[@class='ui-agent__text']/h4[@class='ui-agent__name']")
	WebElement agentName;
	
	@FindBy(xpath="//a[@data-track-label='Agent phone number 1']")
	WebElement agentPhone;
	
	public String name=null;
	
	public fifthProperty()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	
	//Below function will get the logo name, agent name and agent phone number. It will then print it.
	public void getAgentDetails()
	{
		String logo=agentLogo.getAttribute("alt");
		String name=agentName.getText();
		String phone=agentPhone.getText().substring(5);
		System.out.println("Agent details from fith Link----->>");
		System.out.println("Agent Logo: "+logo+"\nAgent name: "+name+"\nAgent Phone number:"+phone);
	}
	
	//Below Function will click on Agent name
	public agentPage clickAgentName()
	{
		name=agentName.getText();
		agentName.click();
		return new agentPage();
	}
}
