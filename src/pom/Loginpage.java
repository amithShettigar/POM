package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="loginlink")
	private WebElement Login;
	
	@FindBy(id="userHandle")
	private WebElement emailaddress;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-login']")
	private WebElement loginbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginlink()
	{
		Login.click();
	}
	
	
	public void emailaddtb(String email)
	{
		emailaddress.sendKeys(email);
		
	}
	
	public void passwordtb(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
		
	}
	


