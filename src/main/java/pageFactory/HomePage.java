package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass{
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	WebElement crmlink;
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement createLead;
	public HomePage clicklink(){
		clickElement(crmlink);
		return this;
	}
	public CreateLead clickLeadlink(){
		clickElement(createLead);
		return new CreateLead();
	}
	public HomePage(){
		PageFactory.initElements(eventDriver, this);
	}
}
