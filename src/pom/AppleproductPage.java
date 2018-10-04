package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleproductPage {
	@FindBy(xpath="//img[@title='Apple iPhone X (64 GB,Space Grey)']")
    private WebElement iphonex;
	
	public  AppleproductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void iphonex()
    {
  	  iphonex.click();
    }
}
