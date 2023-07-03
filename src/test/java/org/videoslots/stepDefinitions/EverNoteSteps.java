package org.videoslots.stepDefinitions;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.videoslots.pages.BasePage;
import org.videoslots.pages.EverNotesHomePage;
import org.videoslots.pages.EverNotesLandingPage;
import org.videoslots.pages.EverNotesLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EverNoteSteps {

	WebDriver driver;
	BasePage basePage;
	EverNotesLandingPage landingPage;
	EverNotesLoginPage loginPage;
	EverNotesHomePage homePage;
	ChromeOptions options;
	Properties config = new Properties();

	@Before
	public void setUp() {
		try {
			config.load(new FileInputStream("./Properties/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		basePage = new BasePage(driver);
		landingPage = new EverNotesLandingPage(driver);
		loginPage = new EverNotesLoginPage(driver);
		homePage = new EverNotesHomePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(config.getProperty("url"));

	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		landingPage.clickLoginLink();

	}

	@When("User enteres unregistered email and clicks continue")
	public void user_entered_valid_credentials() {
		loginPage
		.typeEmail("bbeinjkenkjen@gmail.com")
		.clickContinueButton();
	}
	
	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String error) {
	    String s = loginPage.getResponseMessage();
	    Assert.assertEquals(s, error);
	}
	
	@When("User enteres registered email and clicks continue")
	public void user_enteres_registered_email_and_clicks_continue() {
		loginPage
		.typeEmail(config.getProperty("email"))
		.clickContinueButton();
	}

	@When("User enteres valid password")
	public void user_enteres_valid_password() {
		loginPage
		.typePassword(config.getProperty("password"));
	}

	@When("User clicks on signin")
	public void user_clicks_on_signin() {
		loginPage.clickLogin();
	}
	

	@Then("User can login and see the title")
	public void user_can_login_and_see_the_title() {
		
	  Assert.assertTrue(homePage.getHeaderText().isDisplayed());
	}
	@Given("user is logged in")
	public void user_is_logged_in() {
		loginPage
		.typeEmail(config.getProperty("email"))
		.clickContinueButton()
		.typePassword(config.getProperty("password"))
		.clickLogin();

	}
	@When("user clicks on new button")
	public void user_clicks_on_new_button() {
		homePage.getHeaderText();
		homePage.clickNewButton();
	}

	@When("user choose notes option")
	public void choose_notes() {
		homePage.clickNoteButton();
	}

	@Then("user should be able to take notes and save it")
	public void user_can_take_notes_and_save_it() {
		homePage.typeParaContentAndSave("Test Content - Written By User");
	}
	@Then("user should logout")
	public void user_should_logout() {
	    homePage.clickSettings().clickLoginAndSecurity().clickProfileLink().clickUserMenu();
	}

	
	@When("user clicks on note which is already saved")
	public void user_clicks_on_note_which_is_already_saved() {
		homePage.clickNotesText();
	}

	@Then("user should be able to open the notes")
	public void user_should_be_able_to_open_the_notes() {
		Assert.assertTrue(homePage.getContent().getText().equalsIgnoreCase("Test Content - Written By User"));
	
	}

}
