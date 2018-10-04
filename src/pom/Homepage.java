package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
      @FindBy(id="suggest")
      private WebElement searchbox;
      
      @FindBy(id="search-icon")
      private WebElement searchbtn;
      
      @FindBy(xpath="//a[.='ALL STORES']")
      private WebElement allstores;
      
      @FindBy(xpath="//span[.='Mobiles & Tablets']")
      private WebElement mobiletablets;
      
      @FindBy(xpath="//a[.='Apple']")
      private WebElement apple;
      
      @FindBy(xpath="//a[@href='/ShowCart.action']")
      private WebElement cartbtn;
      
      @FindBy(xpath="//a[@href='/MyAccount.action']")
      private WebElement myaccount;
      
      @FindBy(xpath="//a[@title='WishList']")
      private WebElement wishlist;
      
      @FindBy(xpath="//a[@href='/jsp/logout.jsp']")
      private WebElement logoutlink;
     
      public Homepage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
      
      public void searchboxtb(String text)
      {
    	  searchbox.sendKeys(text);
      }
      
      public void searchbutton()
      {
    	  searchbtn.click();
      }
      
      public void allstoreshover(WebDriver driver)
      {
    	Actions a= new Actions(driver);
    	a.moveToElement(allstores).perform();
      }
      
      public void mobiletabletshover(WebDriver driver)
      {
    	  Actions a=new Actions(driver);
    	  a.moveToElement(mobiletablets).perform();
      }
      
      public void myaccountdrop(WebDriver driver)
      {
    	  Actions a=new Actions(driver);
    	  a.moveToElement(myaccount).perform();
      }
      public void openwishlist()
      {
    	wishlist.click();
      }
      
      public void applelink()
      {
    	  apple.click();
    	  
      }
      
      public void opencart()
      {
    	  cartbtn.click();
    	  
      }
      public void Logout()
      {
    	  logoutlink.click();
      }
      
      }
      
      
      
      

