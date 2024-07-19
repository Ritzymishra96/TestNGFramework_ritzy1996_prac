package qkartPageEvents;

import java.util.UUID;

import org.testng.Assert;

import qkartPageObjects.QKartRegisterPageElements;
import utils.ElementFetch;
import utils.UserCredentials;

//https://www.youtube.com/watch?v=L7P5fqW2kck

public class QkartRegisterPageEvents {

	ElementFetch elem = new ElementFetch();

	public void verifyRegistrationPage() {

		Assert.assertTrue(elem.getWebElements("XPATH", QKartRegisterPageElements.registerNowButtonText).size() > 0,
				"Element Not Found");

	}

	public void newRegistration() {
		
		elem.getWebElement("ID", QKartRegisterPageElements.userIdText).sendKeys(UserCredentials.userName);
		elem.getWebElement("ID", QKartRegisterPageElements.userPasswordText).sendKeys(UserCredentials.password);
		elem.getWebElement("ID", QKartRegisterPageElements.userConfirmPasswordText).sendKeys(UserCredentials.password);
		elem.getWebElement("XPATH", QKartRegisterPageElements.registerNowButtonText).click();

	}

}
