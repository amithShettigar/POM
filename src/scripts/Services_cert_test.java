package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import pom.Home_page;
import pom.Loginpage;

public class Services_cert_test implements Auto_constant {
	static
	{
		System.setProperty(key, value);
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.serviceslink_method(driver);
		hp.datascilink_method();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		lp.logoutmethod(driver);
		driver.quit();
	}

}
