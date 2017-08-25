package wrapper;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WdEventImpl implements WebDriverEventListener{

	/*@Override
	public void afterAlertAccept(WebDriver arg0) {
		
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("The changed value is: "+arg2.toString());
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After clicking on "+arg0);
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("The element located is: "+arg0);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("The Browser" +arg1+" launched with url "+arg0);
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Switched to alert");
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Switched to alert");
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("the value before change is "+arg0);
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		WebDriverWait wait= new WebDriverWait(arg1, 30);
		wait.until(ExpectedConditions.elementToBeClickable(arg0));
		System.out.println("Before clicking on element: "+arg0);
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver arg1) {
		// TODO Auto-generated method stub
		if(throwable instanceof NoSuchElementException){
			System.out.println("The element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof NoSuchWindowException){
			System.out.println("The window could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof NoSuchFrameException){
			System.out.println("The frame could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof NoAlertPresentException){
			System.out.println("The alert could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof InvalidSelectorException){
			System.out.println("The selector used is invalid"+throwable.getMessage());
		}
		else if(throwable instanceof InvalidArgumentException){
			System.out.println("The argument used is invalid"+throwable.getMessage());
		}
		else if(throwable instanceof ElementNotVisibleException){
			System.out.println("The element is not visible"+throwable.getMessage());
		}
		else if(throwable instanceof UnhandledAlertException){
			System.out.println("The alert is not handled"+throwable.getMessage());
		}
		else if(throwable instanceof TimeoutException){
			System.out.println("Command does not complete in time"+throwable.getMessage());
		}
		throw new RuntimeException();
	}

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
