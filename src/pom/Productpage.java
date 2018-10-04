package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
		
	@FindBy(xpath="//img[@title='Google Pixel, very silver, 128 gb']")
    private WebElement googlpxl;
	
	public  Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void googlepixel()
	{
		googlpxl.click();
	}
}
