package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class DemoCookies {
	WebDriver d;

	@Test
	public void cookies() {

		d.manage().deleteAllCookies();
		Cookie c= new Cookie("test","mycookie");
		d.manage().addCookie(c);
		Set<Cookie> myset = d.manage().getCookies();

		for(Cookie s :myset)
		{
			System.out.println(s.getName());
			System.out.println(s.getPath());
			System.out.println(s.getDomain());
		} 
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\Maven0\\src\\test\\resources\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/register"); 

	}

}