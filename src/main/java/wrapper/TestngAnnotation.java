package wrapper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngAnnotation<object> extends WdMethods{
@BeforeSuite
public void beforesuite(){
	
}

@BeforeTest
public void beforetest(){
	
}

@BeforeGroups
public void beforegroups(){
	
}

@BeforeClass
public void beforeclass(){
	
}

@DataProvider(name="Source")
public object[][] dataprovider(){
	object[][] val=new object[2][4];
	val[0][0]="DemoSalesManager";
	
	
}

@BeforeMethod
public void OpenBrowser() {
	invokeAppBrowser("firefox", "http://leaftaps.com/opentaps");
}

@AfterMethod
public void CloseBrowser(){
	quitAppBrowser();
}

@AfterClass
public void afterclass(){
	
}

@AfterGroups
public void aftergroups(){
	
}

@AfterTest
public void aftertest(){
	
}

@AfterSuite
public void aftersuite(){
	
}

}
