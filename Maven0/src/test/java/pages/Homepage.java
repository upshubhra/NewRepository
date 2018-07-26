package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	WebDriver d;
	@FindBy(linkText="Register")
	WebElement Link_Register;


public void Registration()
{
	Link_Register.click();
}

public Homepage(WebDriver driver)
{
	this.d=driver;
	
}
}