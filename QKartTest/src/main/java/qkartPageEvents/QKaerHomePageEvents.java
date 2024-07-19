package qkartPageEvents;

import qkartPageObjects.QKartHomePageElements;
import utils.ElementFetch;

public class QKaerHomePageEvents {

	ElementFetch elem = new ElementFetch();
	public void registerButton() {
		
		elem.getWebElement("XPATH", QKartHomePageElements.registerButtonText).click();
	}
}
