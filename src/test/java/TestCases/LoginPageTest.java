package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import PageObjectModel.RegisterationPage;
import TestComponents.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void Login_an_Account_by_providing_only_the_Mandatory_fields() {
		landingpage.goToMyaccountPage();
		LoginPage LoginpageObj = landingpage.goToLoginPage();

	
}
}
