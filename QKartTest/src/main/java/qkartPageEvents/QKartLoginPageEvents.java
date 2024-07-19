package qkartPageEvents;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import qkartPageObjects.QKartHomePageAfterLogin;
import qkartPageObjects.QKartHomePageElements;
import qkartPageObjects.QKartRegisterPageElements;
import qkartPageObjects.QkartLoginPageElements;
import utils.ElementFetch;
import utils.UserCredentials;
import base.BaseTest;

public class QKartLoginPageEvents {

	QkartRegisterPageEvents hm = new QkartRegisterPageEvents();
	ElementFetch ef = new ElementFetch();
	SoftAssert softAssart = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(40));

	// user will perform login
	public void performLogin() {

		WebElement userName = ef.getWebElement("ID", QkartLoginPageElements.usernameText);

		wait.until(ExpectedConditions.visibilityOf(userName));

		userName.clear();
		userName.sendKeys(UserCredentials.userName);

		WebElement password = ef.getWebElement("ID", QkartLoginPageElements.passwordText);
		password.clear();
		password.sendKeys(UserCredentials.password);

		ef.getWebElement("XPATH", QkartLoginPageElements.loginButtonText).click();
	}

	public void verifyLogin() {

		WebElement searchFieldElem = ef.getWebElement("XPATH", QKartHomePageAfterLogin.searchFieldText);
		wait.until(ExpectedConditions.visibilityOf(searchFieldElem));

		String actualUrl = "https://crio-qkart-frontend-qa.vercel.app/";
		String expectedUrl = BaseTest.driver.getCurrentUrl();

		softAssart.assertEquals(actualUrl, expectedUrl);
		softAssart.assertAll();
	}

}
