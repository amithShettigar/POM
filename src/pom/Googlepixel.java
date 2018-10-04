package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Googlepixel {
	
	@FindBy(id="zipCode")
	private WebElement pincode;
	
	@FindBy(id="zipCheckSubmit")
	private WebElement pinchecksubmit;
	
	@FindBy(xpath="//input[@value='Add To Cart']")
	private WebElement addtocart;
	
	@FindBy(id="wimage1")
	private WebElement heart;
	
	@FindBy(id="color")
	private WebElement selectcolor;
	
	@FindBy(linkText="Be the first to review this item")
	private WebElement addreview;
	
	@FindBy(id="message_title")
	private WebElement review_title;
	
	@FindBy(id="message")
	private WebElement  review_message;
	
	@FindBy(id="submit")
	private WebElement submit;
	@FindBy(id="star1")
	private WebElement star1;
	@FindBy(id="star2")
	private WebElement star2;
	@FindBy(id="star3")
	private WebElement star3;
	@FindBy(id="star4")
	private WebElement star4;
	@FindBy(id="star5")
	private WebElement star5;
	
	
	public Googlepixel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String i)
	{
		pincode.sendKeys(i);
	}
	public void checkpin()
	{
		pinchecksubmit.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void addtowishlist()
	{
		heart.click();
	}
	
	public void selectcolor(int i)
	{
		Select s= new Select(selectcolor);
		s.selectByIndex(i);
	}
	
	public void addreview()
	{
		addreview.click();
	}
	
	public void reviewtitle(String title)
	{
		review_title.sendKeys(title);
	}
	
	public void reviewmessage(String mess)
	{
		review_message.sendKeys(mess);
	}
	
	public void reviewsubmit()
	{
		submit.click();
	}
	
	public void rating(int enterrating)
	{
		switch (enterrating) { 
        case 1: 
            star1.click();
            break; 
        case 2: 
        	star2.click();
            break; 
        case 3: 
        	star3.click(); 
            break; 
        case 4: 
        	star4.click(); 
            break; 
        case 5: 
        	star5.click(); 
            break; 
        
        } 
	}
	
	
}
