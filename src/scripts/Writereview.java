package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;
import pom.Googlepixel;
import pom.Homepage;
import pom.Loginpage;
import pom.Productpage;

public class Writereview implements Auto_constant{
	static
	{
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver= new ChromeDriver();
		
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
		
		h.searchboxtb("Google Pixel");
		h.searchbutton();
		
		Thread.sleep(4000);
		
		Productpage p= new Productpage(driver);
		p.googlepixel();
		Thread.sleep(5000);
		Googlepixel g= new Googlepixel(driver);
		g.addreview();
		
		Thread.sleep(5000);
		
		g.rating(4);
		
		g.reviewtitle("google pixel");
		g.reviewmessage("very good phone,very good phone,very good phone,very good phone,very good phone,very good phone,very good phone");
		g.reviewsubmit();

		

	}

}
