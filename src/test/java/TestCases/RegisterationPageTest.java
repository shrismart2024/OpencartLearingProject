package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import PageObjectModel.RegisterationPage;
import TestComponents.BaseTest;

public class RegisterationPageTest extends BaseTest {
			
	
			@Test
			public void Registering_an_Account_by_providing_only_the_Mandatory_fields() {
				landingpage.goToMyaccountPage();
				RegisterationPage RegisterationpageObj = landingpage.goToRegisterPage();
				Assert.assertTrue(RegisterationpageObj.VerifyRegistrationfields("FirstName","LastName","@Email","452465","Password"));
		
			}
			@Test
			public void Registering_an_Account_by_Not_providing_Mandatory_fields() {
				landingpage.goToMyaccountPage();
				RegisterationPage RegisterationpageObj = landingpage.goToRegisterPage();
				Assert.assertTrue(RegisterationpageObj.Verify_By_Skipping_Mandatory_fields());
				
		
			}
			@Test
			public void Register_into_the_application_by_opting_for_Newsletter_subscription() {
				landingpage.goToMyaccountPage();
				RegisterationPage RegisterationpageObj = landingpage.goToRegisterPage();
				Assert.assertTrue(RegisterationpageObj.Verify_By_opting_for_Newsletter_subscription());
				
		
			}
			@Test
			public void Verify_whether_the_user_is_restricted_from_registring_a_duplicate_account() {
				landingpage.goToMyaccountPage();
				RegisterationPage RegisterationpageObj = landingpage.goToRegisterPage();
				Assert.assertEquals(RegisterationpageObj.Verify_user_is_restricted_from_registring_a_duplicate_account(),"Warning: E-Mail Address is already registered!");
				
		
			}
		
			
}
