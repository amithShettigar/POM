package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.GenericClass;
import pom.Loginpage;
import pom.SearchJobpage;

public class Searchjobtest implements Auto_constant {
	static
	{
		System.setProperty(key,value);
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		String searchdata=GenericClass.genericmethod(excelpath, "Sheet2", 1, 0);
		SearchJobpage sjp=new SearchJobpage(driver);
		sjp.searchmethod(searchdata);
		sjp.searchbtnmethod();
		lp.logoutmethod(driver);
		driver.close();

	}

}
