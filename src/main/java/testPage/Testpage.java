package testPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import wrapper.TestngAnnotation;

public class Testpage extends TestngAnnotation{
@Test(dataProvider="Source")
public void dataProvider(String Uname, pwd, Comp, Fnam){
}
public void loginTest(){
	new LoginPage()
	.typeUsername()
	.typePassword()
	.clickSubmit()
	.clicklink()
	.clickLeadlink()
	.enterCompany()
	.enterFname()
	.enterLname()
	.selectSource()
	.selectMarketing()
	.enterPhone()
	.enteremail()
	.clickSubmit()
	.getLeadName();
}
}
