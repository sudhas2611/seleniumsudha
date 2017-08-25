package wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WdMethods extends WdEventImpl{
public WebDriver driver;
public static EventFiringWebDriver eventDriver;
	public void invokeAppBrowser(String browsertype, String url){
		
		switch(browsertype){
		case("ie"):
			System.setProperty("webdriver.ie.driver","./drivers/iedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case("chrome"):
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case("firefox"):
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		eventDriver = new EventFiringWebDriver(driver);
		WdEventImpl handler = new WdEventImpl();
		eventDriver.register(handler);
		eventDriver.get(url);
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void quitAppBrowser(){
		eventDriver.close();
	}
	public WebElement locateElement(String ele, String locatorval){
		WebElement elem = null;
		switch(ele){
		case("id"):
			elem = eventDriver.findElement(By.id(locatorval));
		break;
		case("name"):
			elem = eventDriver.findElement(By.name(locatorval));
		break;
		case("className"):
			elem = eventDriver.findElement(By.className(locatorval));
		break;
		case("linkText"):
			elem = eventDriver.findElement(By.linkText(locatorval));
		break;
		case("partiallinkText"):
			elem = eventDriver.findElement(By.partialLinkText(locatorval));
		break;
		case("tagName"):
			elem = eventDriver.findElement(By.tagName(locatorval));
		break;
		case("xpath"):
			elem = eventDriver.findElement(By.xpath(locatorval));
		break;
		case("css"):
			elem = eventDriver.findElement(By.cssSelector(locatorval));
		break;
		}
		return elem;
	
	}
	public void type(WebElement ele, String value){
		ele.sendKeys(value);
	}
	public void clickElement(WebElement ele){
		ele.click();
	}
	public void clearText(WebElement ele){
		ele.clear();
	}
	public void selectByVisibleText(WebElement ele, String value){
		Select vistext= new Select(ele);
		vistext.selectByVisibleText(value);
	}
	public void selectByIndex(WebElement ele, int value){
		Select vistext= new Select(ele);
		vistext.selectByIndex(value);
	}
	
	public void selectByValue(WebElement ele, String value1){
		Select vistext= new Select(ele);
		vistext.selectByValue(value1);
	}
	public void switchToWindow(int index){
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventDriver.switchTo().window(allWindows.get(index));
	}
	public void alertAccept(){
		eventDriver.switchTo().alert().accept();
		
	}
	public void alertDismiss(){
		eventDriver.switchTo().alert().dismiss();
		
	}
	public void alertText(String text){
		eventDriver.switchTo().alert().sendKeys(text);
	}
	public String getAlertText(){
		String txt = eventDriver.switchTo().alert().getText();
		return txt;
	}
	public void switchFrame(WebElement ele){
		eventDriver.switchTo().frame(ele);
		
	}
	public boolean verifyTitle(String title){
		String uTitle = eventDriver.getTitle();
		if(uTitle.equals(title)){
			return true;
		}
		else
			return false;
	}
	public void getAttribute(WebElement ele,String attribute){
		ele.getAttribute(attribute);
	}
	public String getText(WebElement ele, String text){
		String gTxt = ele.getText();
		System.out.println(gTxt);
		return gTxt;
		
	}
	public boolean verifyText(WebElement ele, String text){
		String uTxt = ele.getText();
		if(uTxt.equals(text)){
			return true;
		}
		else
			return false;
	}
	public void takeSnap(){
	}

}
