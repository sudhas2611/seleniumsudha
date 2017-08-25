/**
 * 
 */
package wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author z021187
 *
 */
public interface WdBase {
	/**
	 * This method is to invoke the browser 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void invokeAppBrowser(String browsertype, String url);
	/**
	 * This method is to close the browser 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void quitAppBrowser();
	/**
	 * This method is to locate the element 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public WebElement locateElement(String ele, String locatorval);
	/**
	 * This method is to type the value in the element located 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void type(WebElement ele, String value);
	/**
	 * This method is to click the element located 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void clickElement(WebElement ele);
	/**
	 * This method is to clear the text 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void clearText(WebElement ele);
	/**
	 * This method is to select by visibe text for the located element 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void selectByVisibleText(WebElement ele, String value);
	/**
	 * This method is to select by index for the located element 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void selectByIndex(WebElement ele, int value);
	/**
	 * This method is to select by value for the located element 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void selectByValue(WebElement ele, String value1);
	/**
	 * This method is to switch windows 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void switchToWindow(int index);
	/**
	 * This method is to accept the alert 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void alertAccept();
	/**
	 * This method is to dismiss alert 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void alertDismiss();
	/**
	 * This method is to send text in alerts 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void alertText(String text);
	/**
	 * This method is to get text in alerts 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public String getAlertText();
	/**
	 * This method is to switch the frames 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void switchFrame(WebElement ele);
	/**
	 * This method is to verify the titles 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public boolean verifyTitle(String title);
	/**
	 * This method is to get the attributes 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void getAttribute(WebElement ele,String attribute);
	/**
	 * This method is to get the text 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public String getText(WebElement ele, String text);
	/**
	 * This method is to verify the text 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public boolean verifyText(WebElement ele, String text);
	/**
	 * This method is to take snap 
	 * @param browsertype - firefox
	 * @param url - http://leaftaps.com/opentaps
	 * @author z021187
	 */
	public void takeSnap();
}