package org.videoslots.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.videoslots.commonutls.CommonMethods;

public class EverNotesHomePage extends BasePage {
	
	CommonMethods cm;

	public EverNotesHomePage(WebDriver driver) {
		super(driver);
		cm = new CommonMethods(driver);
		// TODO Auto-generated constructor stub
	}

	final String headerNotes_css = "article[data-asloc='Notes'] h2";
	final String newButton_css = "button[id='qa-CREATE_NOTE']";
	final String noteButton_xpath = "//button/span[contains(text(),'Note')]";
	final String para_css = "div[class='para']";
	final String iframe_css = "iframe[title='Note Editor']";
	final String textArea_css = "textarea[inputmode='text']";
	final String notesText_xpath = "//button[1]//div[1]/span[contains(text(),'Test Content - Written By User')]";
	final String textContent_css = "en-note[id='en-note'] div";
	final String settings_css = "button[aria-label='Settings'] svg";
	final String loginSecurity_xapth = "//li[@aria-label='Login & security']/span/span[contains(text(),'Login')] ";
	final String goToProfileLink_css = "#react-tabs-17 button > span";
	final String userMenu_css = "a[id='user-menu-dropdown']";
	final String logout_css = "a[href='/Logout.action']";

	@FindBy(css = headerNotes_css)
	private WebElement headerNotes;

	@FindBy(css = newButton_css)
	private WebElement newButton;

	@FindBy(xpath = noteButton_xpath)
	private WebElement noteButton;

	@FindBy(css = para_css)
	private WebElement para;

	@FindBy(css = iframe_css)
	private WebElement iframeThing;
	@FindBy(css = textArea_css)
	private WebElement textAreaClick;

	@FindBy(xpath = notesText_xpath)
	private WebElement notesText;

	@FindBy(css = textContent_css)
	private WebElement textContent;
	
	@FindBy(css = settings_css)
	private WebElement settings;
	
	@FindBy(xpath =loginSecurity_xapth )
	private WebElement loginSecurity;
	
	@FindBy(css = goToProfileLink_css)
	private WebElement goToProfileLink;
	
	@FindBy(css = userMenu_css)
	private WebElement userMenu;
	
	@FindBy(css = logout_css)
	private WebElement logout;
	
	public WebElement getContent() {
		this.switchToTextFrame();
		try {
			Thread.sleep(5000);
		}
		catch(Exception e){
			
		}
		return textContent;
	}
	public WebElement getNotesText() {
		return notesText;
	}

	public WebElement getHeaderText() {
		cm.waitForElementCss(headerNotes_css, 60);
		return headerNotes;
	}

	public EverNotesHomePage clickNewButton() {
		this.newButton.click();
		return this;
	}

	public EverNotesHomePage clickNoteButton() {
		this.noteButton.click();
		return this;
	}

	public EverNotesHomePage switchToTextFrame() {
		driver.switchTo().frame(this.iframeThing);
		return this;
	}

	public EverNotesHomePage clickTitleAreaToSave() {
		cm.mouseMoveTo(textAreaClick);
		this.textAreaClick.click();
		return this;
	}

	public EverNotesHomePage typeParaContentAndSave(String content) {
		this.switchToTextFrame();
		cm.waitForElementCss(para_css, 60);
		this.para.sendKeys(content);
		this.clickTitleAreaToSave();
		return this;
	}

	public EverNotesHomePage clickNotesText() {
		cm.waitForElementXpath(notesText_xpath, 60);
		this.notesText.click();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EverNotesHomePage clickSettings() {
		driver.switchTo().defaultContent();
		this.settings.click();
		return this;
	}
	
	public EverNotesHomePage clickLoginAndSecurity() {
		
		this.loginSecurity.click();
		return this;
	}
	
public EverNotesHomePage clickProfileLink() {
		
		this.goToProfileLink.click();
		return this;
	}

public EverNotesHomePage logout() {
	
	this.logout.click();
	return this;
}

public EverNotesHomePage clickUserMenu() {
	String originalWin = driver.getWindowHandle();
	cm.switchToChildWindow(originalWin);
	this.userMenu.click();
	this.logout();
	driver.close();
	cm.switchToMainWindow(originalWin);
	return this;
}

}
