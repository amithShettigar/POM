package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Auto_constant;
import generic.GenericClass;
import pom.Adv_search_page;
import pom.Loginpage;

public class Adv_search_test implements Auto_constant {
	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		Adv_search_page asp=new Adv_search_page(driver);
		Actions act=new Actions(driver);
		Robot r=new Robot();
		asp.searchmethod();
		asp.adv_search_method();
		String keyskill=GenericClass.genericmethod(excelpath, "Sheet3", 1, 0);
		String location=GenericClass.genericmethod(excelpath, "Sheet3", 1, 1);
		String industry=GenericClass.genericmethod(excelpath, "Sheet3", 1, 2);
		//String year=GenericClass.genericmethod(excelpath, "Sheet3", 1, 3);
		//String month=GenericClass.genericmethod(excelpath, "Sheet3", 1, 4);
		//String sal=GenericClass.genericmethod(excelpath, "Sheet3", 1, 5);
		String jobcat=GenericClass.genericmethod(excelpath, "Sheet3", 1, 6);
		//int yr=Integer.parseInt(year)
		//System.out.println(keyskill+location+industry+year+month);
		asp.keyskill_method(keyskill,r);
		//r.keyPress(KeyEvent.VK_ESCAPE);
		asp.location_method(location);
		asp.workexpyear_method();
		asp.yearselected_method();
		asp.workexpmonth_method();
		asp.expsalary_method();
		asp.expsalselected_method();
		asp.industry_method(industry,r);
		
		asp.jobcategory_method();
		asp.jobcatselected_method();
		asp.submit_method();
		lp.logoutmethod(driver);
		driver.close();
		
	}

}
