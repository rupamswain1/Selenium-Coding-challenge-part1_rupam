package Assignment.Zoopla.WebPages;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Assignment.Zoopla.BrowserDriver.Driver;

public class PropertyForSale 
{
	@FindBy(xpath="//div[@id='content']//ul[@class='listing-results clearfix js-gtm-list']//a[@class='listing-results-price text-price']")
	List<WebElement> propertyList;
	
	
	public PropertyForSale()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	public void printPropertyDescending() 
	{
		List<Long> priceList=new ArrayList<Long>();
		for(WebElement property:propertyList)
		{
			
			if(property.getText().matches("^[a-zA-Z]*$"))
				continue;
			String rawPrice=property.getText().split(" ")[0];
			Long price=Long.parseLong(rawPrice.replace("£", "").replace(",", ""));
			priceList.add(price);
			
		}
		Collections.sort(priceList, Collections.reverseOrder());
		System.out.println("Printing Property price in Descending order:------>>");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		for(Long price:priceList)
		{
			String currencyPrice=numFormat.format(price).toString();
			System.out.println(currencyPrice.substring(0, currencyPrice.indexOf(".")));
		}
	}
	
	public fifthProperty selectFithProperty()
	{
		/*JavascriptExecutor js=((JavascriptExecutor) Driver.driver);
		js.executeScript("arguments[0].scrollIntoView(true);",propertyList.get(4));*/
		Actions action=new Actions(Driver.driver);
		action.moveToElement(propertyList.get(4)).build().perform();
		propertyList.get(4).click();
		return new fifthProperty();
	}
}
