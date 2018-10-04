package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	@FindBy(xpath="//a[@title='Delete From Shopping List']")
	private WebElement remove;
	
	public  Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void removefromcart()
	{
		remove.click();
	}

}
