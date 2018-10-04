package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.GenericClass;
import pom.Loginpage;

public class LoginTest implements Auto_constant {
	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Loginpage lp=new Loginpage(driver);
		mainLogin(driver,lp);
		lp.logoutmethod(driver);
		driver.close();
		
		
	}
	
	public static void mainLogin(WebDriver driver,Loginpage lp)
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String username=GenericClass.genericmethod(excelpath, "Sheet1", 1, 0);
		String password=GenericClass.genericmethod(excelpath, "Sheet1", 1, 1);
		System.out.println(username+password);
		lp.loginmethod(username,password);
	}

}
