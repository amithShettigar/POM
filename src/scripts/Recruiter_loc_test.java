package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import pom.Brow_recruiters_page;
import pom.Home_page;
import pom.Loginpage;

public class Recruiter_loc_test implements Auto_constant{
	static
	{
		System.setProperty(key,value);
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.recruiterlink_method(driver);
		hp.browseallrec_method();
		
		ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(tab1);
		driver.switchTo().window(tab1.get(1));
		
		Brow_recruiters_page brp=new Brow_recruiters_page(driver);
		brp.locmumbai();
		
		tab1.clear();
		tab1.addAll(driver.getWindowHandles());
		
		//System.out.println(tab1);
		driver.switchTo().window(tab1.get(2));
		lp.logoutmethod(driver);
		driver.quit();
		
		
	}

}
