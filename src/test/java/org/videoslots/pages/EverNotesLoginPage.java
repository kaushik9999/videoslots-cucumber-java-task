package org.videoslots.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.videoslots.commonutls.CommonMethods;

public class EverNotesLoginPage extends BasePage {
	CommonMethods commonMethods;

	public EverNotesLoginPage(WebDriver driver) {
		super(driver);
		commonMethods = new CommonMethods(driver);
	}
	
	final String email_css = "input[name='username']";
	final String password_css = "input[name='password']";
	final String login_css = "input[value='Sign in']";
	final String continueButton_css = "input[id='loginButton']";
	final String responseMessage_css = "div[id='responseMessage']";
	final String robotCheckBox_css = "span[role='checkbox']";
	

	@FindBy(css = email_css)
	private WebElement emailField;
	
	@FindBy(css = password_css)
	private WebElement passwordField;
	
	@FindBy(css = login_css)
	private WebElement loginField;
	
	@FindBy(css = continueButton_css)
	private WebElement continueButton;

	@FindBy(css = responseMessage_css)
	private WebElement responseMessage;
	
	@FindBy(css = robotCheckBox_css)
	private WebElement robotCheckBox;	
	
	public EverNotesLoginPage typeEmail(String email) {
		this.emailField.sendKeys(email);
		return this;
	}
	
	public EverNotesLoginPage typePassword(String password) {
		this.passwordField.sendKeys(password);
		return this;
	}
	public EverNotesLoginPage clickLogin() {
		this.loginField.click();
		return this;
	}
	public EverNotesLoginPage clickContinueButton() {
		this.continueButton.click();
		return this;
	}
	
	public WebElement getRobotCheckbox() {
		return robotCheckBox;
		
	}
	
	public EverNotesLoginPage clickRobotCheckbox() {
		this.robotCheckBox.click();
		return this;
	}
	
	public String getResponseMessage() {
		commonMethods.waitForElementCss(responseMessage_css, 60);
		String text =  this.responseMessage.getText();
		return text;
	}
	
	
	
	
}
