package org.videoslots.commonutls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;

	}

	public void waitForElementCss(String selector, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
	}

	public void waitForElementXpath(String selector, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
	}

	public void mouseMoveTo(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}

}
