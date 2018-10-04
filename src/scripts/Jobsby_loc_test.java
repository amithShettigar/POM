package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import pom.Home_page;
import pom.Jobsby_loc_page;
import pom.Loginpage;

public class Jobsby_loc_test implements Auto_constant{
	
	static
	{
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.jobslink_method(driver);
		hp.jobsbyloclink_method();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Jobsby_loc_page jlp=new Jobsby_loc_page(driver);
		jlp.jobmumbailink_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(2000);
		lp.logoutmethod(driver);
		driver.quit();
	}

}
