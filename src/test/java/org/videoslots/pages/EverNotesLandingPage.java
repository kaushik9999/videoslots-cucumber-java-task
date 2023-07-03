package org.videoslots.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EverNotesLandingPage extends BasePage {

	public EverNotesLandingPage(WebDriver driver) {
		super(driver);
	}
	
	final String loginLink_css = "nav.utility-nav a[href*='Login.action']";

	@FindBy(css = loginLink_css)
	private WebElement loginLink;

	public EverNotesLandingPage clickLoginLink() {
		this.loginLink.click();
		return this;
	}
}
