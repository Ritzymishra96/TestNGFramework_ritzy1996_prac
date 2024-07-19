package qa.QKartTest;

import org.testng.annotations.Test;

import base.BaseTest;
import qkartPageEvents.QKaerHomePageEvents;
import qkartPageEvents.QKartLoginPageEvents;
import qkartPageEvents.QkartRegisterPageEvents;
import utils.ElementFetch;

public class QKartTestCase1 extends BaseTest {
	
	ElementFetch elem = new ElementFetch();
	QKaerHomePageEvents homePage = new QKaerHomePageEvents();
	QkartRegisterPageEvents registationPage = new QkartRegisterPageEvents();
	QKartLoginPageEvents loginPage = new QKartLoginPageEvents();
  @Test(priority = 0)
  public void newRegistrationAndLOgin() throws InterruptedException {
	  
	  //Registration
	  
	  homePage.registerButton();
	  logger.info("Registration Button Clicked Successfuly");
	  
	  registationPage.verifyRegistrationPage();
	  logger.info("Verifucation Done for Register Page");
	  
	  registationPage.newRegistration();
	  logger.info("Registration Completed");
	  
	  Thread.sleep(5000);
	  logger.info("Wait for loging page appear");
	  //login
	  loginPage.performLogin();
	  logger.info("Login Successful");
	  
	  loginPage.verifyLogin();
	  logger.info("Login Verification complete");
	  
  }
  
  
}
