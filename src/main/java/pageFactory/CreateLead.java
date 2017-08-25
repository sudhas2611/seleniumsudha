package pageFactory;

import java.awt.Graphics;
import java.awt.Shape;

import javax.swing.text.BadLocationException;
import javax.swing.text.View;
import javax.swing.text.Position.Bias;

import org.eclipse.jetty.websocket.common.events.EventDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLead extends AbstractClass{
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement company;
	public CreateLead enterCompany(){
		type(company, "xyz");
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement fname;
	public CreateLead enterFname(){
		type(fname, "fabc");
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement lname;
	public CreateLead enterLname(){
		type(lname, "labc");
		return this;
	}
	@FindBy(how=How.CLASS_NAME, using="createLeadForm_dataSourceId")
	WebElement source;
	public CreateLead selectSource(){
		type(source, "Cold Call");
		return this;
	}
	@FindBy(how=How.CLASS_NAME, using="createLeadForm_marketingCampaignId")
	WebElement marketing;
	public CreateLead selectMarketing(){
		type(marketing, "Automobile");
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	WebElement phone;
	public CreateLead enterPhone(){
		type(phone, "8976");
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	WebElement email;
	public CreateLead enteremail(){
		type(email, "a@abc.com");
		return this;
	}
	@FindBy(how=How.NAME, using="submitButton")
	WebElement submit;
	public ViewLead clickSubmit(){
		clickElement(submit);
		return new ViewLead();
	}
	public CreateLead(){
		PageFactory.initElements(eventDriver, this);
	}
}

