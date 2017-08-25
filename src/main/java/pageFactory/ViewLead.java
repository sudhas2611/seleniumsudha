package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLead extends AbstractClass{
	
	@FindBy(how=How.LINK_TEXT, using="viewLead_companyName_sp")
	WebElement view;
	
	public ViewLead(){
		PageFactory.initElements(eventDriver, this);
	}
	public ViewLead getLeadName(){
		getText(view, "1234");
		return this;
	}

}
