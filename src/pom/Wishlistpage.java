package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
 @FindBy(xpath="//span[.='Remove from wishlist']")
 private WebElement remove;


public Wishlistpage(WebDriver driver)
{
	  PageFactory.initElements(driver, this);
}

public void removefromwishlist()
{
	remove.click();
	}

}

