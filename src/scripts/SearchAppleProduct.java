package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;
import pom.AppleproductPage;
import pom.Homepage;
import pom.Loginpage;

public class SearchAppleProduct implements Auto_constant{
	static
	{
		
		System.setProperty(key, value);
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pass = Excel.abc(excelpath, "Sheet1", 1, 0);
		driver.get("https://www.infibeam.com/");
		
		Loginpage  l=new Loginpage(driver);
		
		l.loginlink();
		Thread.sleep(4000);
		l.emailaddtb(email);
		l.passwordtb(pass);
		l.loginbutton();
		
		Homepage h= new Homepage(driver);
		
		h.allstoreshover(driver);
		Thread.sleep(4000);
		h.mobiletabletshover(driver);
		h.applelink();
		
		AppleproductPage appl=new AppleproductPage(driver);
		appl.iphonex();
		
	}

}
