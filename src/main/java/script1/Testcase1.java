package script1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.Test;

import wrapper.TestngAnnotation;
import wrapper.WdMethods;

public class Testcase1 extends TestngAnnotation{
	@Test
	public void createLead() {
		invokeAppBrowser("firefox", "http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		clickElement(locateElement("className", "decorativeSubmit"));
		clickElement(locateElement("linkText", "CRM/SFA"));
		clickElement(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "company");
		type(locateElement("id", "createLeadForm_firstName"), "fname");
		type(locateElement("id", "createLeadForm_lastName"), "lname");
		clickElement(locateElement("id", "createLeadForm_dataSourceId"));
		selectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"),"Cold Call");
		clickElement(locateElement("id", "createLeadForm_marketingCampaignId"));
		selectByVisibleText(locateElement("id", "createLeadForm_marketingCampaignId"),"Automobile");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "990080");
		type(locateElement("id", "createLeadForm_primaryEmail"), "a@aa.com");
		clickElement(locateElement("name", "submitButton"));
		getText(locateElement("id", "viewLead_companyName_sp"), "12409");
		quitAppBrowser();
		/*System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("company");
		driver.findElementById("createLeadForm_firstName").sendKeys("fname");
		driver.findElementById("createLeadForm_lastName").sendKeys("lname");
		WebElement ddown = driver.findElementById("createLeadForm_dataSourceId");
		ddown.click();
		Select dropdown = new Select(ddown);
		dropdown.selectByVisibleText("Cold Call");
		WebElement ddown2 = driver.findElementById("createLeadForm_marketingCampaignId");
		ddown2.click();
		
		Select dropdown2 = new Select(ddown2);
		dropdown2.selectByVisibleText("Automobile");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("990080");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("a@aa.om");
		driver.findElementByName("submitButton").click();
		
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		driver.close();
*/

	}

}
