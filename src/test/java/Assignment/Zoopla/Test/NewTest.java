package Assignment.Zoopla.Test;

import org.testng.annotations.Test;

import Assignment.Zoopla.BrowserDriver.Driver;
import Assignment.Zoopla.WebPages.PropertyForSale;
import Assignment.Zoopla.WebPages.agentPage;
import Assignment.Zoopla.WebPages.fifthProperty;
import Assignment.Zoopla.WebPages.homePage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
  
  @BeforeClass
  public void beforeClass() {
	  Driver.initialize();
	  
  }
	
	
@Test
  public void valiDateAgentName() 
{
	homePage obj=new homePage();
	obj.searchLocation();
	PropertyForSale sale=new PropertyForSale();
	sale.printPropertyDescending();
	fifthProperty fProperty=sale.selectFithProperty();
	fProperty.getAgentDetails();
	agentPage page=fProperty.clickAgentName();
	Assert.assertEquals(fProperty.name, page.getAgentName());
	
}
 

  @AfterClass
  public void afterClass() {
	  Driver.driver.quit();
  }

}
