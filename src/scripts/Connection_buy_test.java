package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import pom.Home_page;
import pom.Loginpage;
import pom.Recruiter_conn_page;
import pom.SearchRec_buy_page;

public class Connection_buy_test implements Auto_constant{

	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.recruiterlink_method(driver);
		hp.recconnlink_method();
		ArrayList< String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Recruiter_conn_page rcp=new Recruiter_conn_page(driver);
		rcp.buyredilink_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		SearchRec_buy_page sbp=new SearchRec_buy_page(driver);
		sbp.buynowbtn_method();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		lp.logoutmethod(driver);
		driver.quit();
	}
}
