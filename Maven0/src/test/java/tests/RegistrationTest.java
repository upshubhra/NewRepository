package tests;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Registration;
import utilitypackage.ExcelUtility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class RegistrationTest {
	WebDriver d;
	public Homepage h;
	Registration r;
	ExcelUtility e;
	
  @Test
  public void f() throws IOException {
	 h.Registration();
	 e.getTestdata();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\Maven0\\src\\test\\resources\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://demowebshop.tricentis.com/register"); 
	  d.manage().window().maximize();
	  h = PageFactory.initElements(d,Homepage.class);
	  r = PageFactory.initElements(d,Registration.class);
	  e = new ExcelUtility();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
