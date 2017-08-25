package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass{
	
	
	@FindBy(how=How.ID, using="username")
	WebElement uname;
	public LoginPage typeUsername(){
		type(uname, "DemoSalesManager");
		return this;
	}
	@FindBy(how=How.ID, using="password")
	WebElement pword;
	public LoginPage typePassword(){
		type(pword, "crmsfa");
		return this;
	}
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement submit;
	public HomePage clickSubmit(){
		clickElement(submit);
		return new HomePage();
	}
	public LoginPage(){
		PageFactory.initElements(eventDriver, this);
	}

}
